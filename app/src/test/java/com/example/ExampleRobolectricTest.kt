package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.model.LabourBackupData
import com.example.data.model.Worker
import com.example.util.BackupManager
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

    @Test
    fun `read string from context`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val appName = context.getString(R.string.app_name)
        assertEquals("LabourMaster", appName)
    }

    @Test
    fun `worker model contains address and pro fields`() {
        val worker = Worker(
            workerId = "W-101",
            name = "Ko Rajesh",
            workerType = "Carpenter",
            dailyRate = 28000.0,
            otRate = 4000.0,
            address = "ပဲခူးတိုင်း၊ ညောင်လေးပင်",
            nrcNo = "၁၂/လမတ(နိုင်)၁၂၃၄၅၆",
            emergencyContactName = "Daw Thida",
            emergencyPhone = "09450112233",
            bloodType = "O+",
            skillLevel = "Foreman",
            paymentMethod = "KBZPay",
            paymentAccount = "0978912345"
        )
        assertEquals("ပဲခူးတိုင်း၊ ညောင်လေးပင်", worker.address)
        assertEquals("၁၂/လမတ(နိုင်)၁၂၃၄၅၆", worker.nrcNo)
        assertEquals("O+", worker.bloodType)
        assertEquals("Foreman", worker.skillLevel)
    }

    @Test
    fun `backup manager serializes and deserializes worker address cleanly`() {
        val worker = Worker(
            workerId = "W-101",
            name = "Ko Rajesh",
            address = "ပဲခူးတိုင်း၊ ညောင်လေးပင်",
            nrcNo = "၁၂/လမတ(နိုင်)၁၂၃၄၅၆",
            bloodType = "O+"
        )
        val backup = LabourBackupData(
            workers = listOf(worker)
        )
        val json = BackupManager.serializeToJson(backup)
        val restored = BackupManager.parseFromJson(json)
        assertEquals(1, restored.workers.size)
        assertEquals("ပဲခူးတိုင်း၊ ညောင်လေးပင်", restored.workers[0].address)
        assertEquals("၁၂/လမတ(နိုင်)၁၂၃၄၅၆", restored.workers[0].nrcNo)
        assertEquals("O+", restored.workers[0].bloodType)
    }
}

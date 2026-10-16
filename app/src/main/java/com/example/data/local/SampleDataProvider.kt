package com.example.data.local

import com.example.data.model.AttendanceRecord
import com.example.data.model.Site
import com.example.data.model.Worker

object SampleDataProvider {

    // Known sample names to purge if previously saved in earlier builds
    val SAMPLE_WORKER_NAMES = setOf(
        "Ko Rajesh (လက်သမား)",
        "U Amit (ပန်းရံခေါင်းဆောင်)",
        "Ko Sunil (အကူ)",
        "Ko Ramesh (အကူ)",
        "U Dinesh (လက်သမား)",
        "Daw Pooja (အကူ)",
        "Daw Kiran (အကူ)",
        "U Aslam (လျှပ်စစ်ကျွမ်းကျင်)",
        "Ko Vikram (ပန်းရံ)",
        "Ko Sanjay (ဆေးသုတ်)",
        "Ko Deepak (ရေပိုက်)",
        "U Manoj (သံချည်သံကွေး)"
    )

    fun isSampleWorker(worker: Worker): Boolean {
        return worker.name in SAMPLE_WORKER_NAMES
    }

    /**
     * Do NOT add any sample workers.
     * Starts with a 100% clean slate so the user can enter their own real workers.
     */
    fun getInitialWorkers(): List<Worker> {
        return emptyList()
    }

    fun getInitialSites(): List<Site> {
        return listOf(
            Site("S-01", "Main Construction Site (ပင်မဆောက်လုပ်ရေးဆိုဒ်)", "Yangon", "Site Supervisor", "Ongoing"),
            Site("S-02", "Project Site B (ဆိုဒ်ခွဲ B)", "Yangon", "Site Engineer", "Ongoing")
        )
    }

    /**
     * Do NOT add any sample attendance records.
     */
    fun getInitialAttendance(): List<AttendanceRecord> {
        return emptyList()
    }
}

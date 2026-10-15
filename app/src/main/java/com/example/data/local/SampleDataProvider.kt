package com.example.data.local

import com.example.data.model.AttendanceRecord
import com.example.data.model.Site
import com.example.data.model.Worker
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

object SampleDataProvider {

    fun getInitialWorkers(): List<Worker> {
        return listOf(
            Worker(
                workerId = "W-101",
                name = "Ko Rajesh (လက်သမား)",
                gender = "Male",
                workerType = "Carpenter",
                dailyRate = 28000.0,
                otRate = 4000.0,
                status = "Active",
                phone = "0978912345",
                address = "ရန်ကုန်တိုင်း၊ အင်းစိန်မြို့နယ်၊ အရှေ့ကြို့ကုန်း",
                nrcNo = "၁၂/အစန(နိုင်)၀၉၁၂၃၄",
                emergencyContactName = "ဒေါ်သီတာ (ဇနီး)",
                emergencyPhone = "09450112233",
                bloodType = "O+",
                skillLevel = "Foreman",
                paymentMethod = "KBZPay",
                paymentAccount = "0978912345",
                joinedDate = "2024-01-15"
            ),
            Worker(
                workerId = "W-102",
                name = "U Amit (ပန်းရံခေါင်းဆောင်)",
                gender = "Male",
                workerType = "Mason",
                dailyRate = 30000.0,
                otRate = 4500.0,
                status = "Active",
                phone = "0978912346",
                address = "ပဲခူးတိုင်း၊ ညောင်လေးပင်မြို့နယ်၊ ရွှေကျင်လမ်း",
                nrcNo = "၇/ညလပ(နိုင်)၁၁၂၂၃၃",
                emergencyContactName = "ဒေါ်ခင်စန်းဝင်း (ဇနီး)",
                emergencyPhone = "09250334455",
                bloodType = "B+",
                skillLevel = "Foreman",
                paymentMethod = "WavePay",
                paymentAccount = "0978912346",
                joinedDate = "2024-02-01"
            ),
            Worker(
                workerId = "W-103",
                name = "Ko Sunil (အကူ)",
                gender = "Male",
                workerType = "Helper",
                dailyRate = 18000.0,
                otRate = 2500.0,
                status = "Active",
                phone = "0978912347",
                address = "ဧရာဝတီတိုင်း၊ ဟင်္သာတမြို့နယ်၊ တာငါးဆယ်",
                nrcNo = "၁၄/ဟသတ(နိုင်)၂၂၃၃၄၄",
                emergencyContactName = "ဦးအုန်းမြင့် (ဖခင်)",
                emergencyPhone = "09690556677",
                bloodType = "A+",
                skillLevel = "Helper",
                paymentMethod = "Cash",
                paymentAccount = "",
                joinedDate = "2024-03-10"
            ),
            Worker(
                workerId = "W-104",
                name = "Ko Ramesh (အကူ)",
                gender = "Male",
                workerType = "Helper",
                dailyRate = 18000.0,
                otRate = 2500.0,
                status = "Active",
                phone = "0978912348",
                address = "မကွေးတိုင်း၊ ပခုက္ကူမြို့နယ်၊ ရေစကြိုလမ်း",
                nrcNo = "၈/ပခက(နိုင်)၃၃၄၄၅၅",
                emergencyContactName = "ဦးမောင်လေး (အစ်ကို)",
                emergencyPhone = "09790667788",
                bloodType = "O+",
                skillLevel = "Helper",
                paymentMethod = "Cash",
                paymentAccount = "",
                joinedDate = "2024-04-05"
            ),
            Worker(
                workerId = "W-105",
                name = "U Dinesh (လက်သမား)",
                gender = "Male",
                workerType = "Carpenter",
                dailyRate = 28000.0,
                otRate = 4000.0,
                status = "Active",
                phone = "0978912349",
                address = "ရန်ကုန်တိုင်း၊ လှိုင်သာယာမြို့နယ်၊ ၆ ရပ်ကွက်",
                nrcNo = "၁၂/လသယ(နိုင်)၄၄၅၅၆၆",
                emergencyContactName = "ဒေါ်မာမာ (ဇနီး)",
                emergencyPhone = "09440778899",
                bloodType = "AB+",
                skillLevel = "Skilled",
                paymentMethod = "KBZPay",
                paymentAccount = "0978912349",
                joinedDate = "2024-02-20"
            ),
            Worker(
                workerId = "W-106",
                name = "Daw Pooja (အကူ)",
                gender = "Female",
                workerType = "Helper",
                dailyRate = 18000.0,
                otRate = 2500.0,
                status = "Active",
                phone = "0978912350",
                address = "ပဲခူးတိုင်း၊ သာယာဝတီမြို့နယ်၊ သုံးဆယ်လမ်း",
                nrcNo = "၇/သဝတ(နိုင်)၅၅၆၆၇၇",
                emergencyContactName = "ဒေါ်မြရင် (မိခင်)",
                emergencyPhone = "09260889900",
                bloodType = "B+",
                skillLevel = "Helper",
                paymentMethod = "WavePay",
                paymentAccount = "0978912350",
                joinedDate = "2024-05-12"
            ),
            Worker(
                workerId = "W-107",
                name = "Daw Kiran (အကူ)",
                gender = "Female",
                workerType = "Helper",
                dailyRate = 18000.0,
                otRate = 2500.0,
                status = "Active",
                phone = "0978912351",
                address = "ဧရာဝတီတိုင်း၊ ညောင်တုန်းမြို့နယ်၊ ရွှေဟင်္သာရပ်",
                nrcNo = "၁၄/ညတန(နိုင်)၆၆၇၇၈၈",
                emergencyContactName = "ဦးစိုးမြင့် (ဖခင်)",
                emergencyPhone = "09970990011",
                bloodType = "A-",
                skillLevel = "Helper",
                paymentMethod = "Cash",
                paymentAccount = "",
                joinedDate = "2024-06-01"
            ),
            Worker(
                workerId = "W-108",
                name = "U Aslam (လျှပ်စစ်ကျွမ်းကျင်)",
                gender = "Male",
                workerType = "Electrician",
                dailyRate = 35000.0,
                otRate = 5000.0,
                status = "Active",
                phone = "0978912352",
                address = "မန္တလေးတိုင်း၊ ချမ်းအေးသာစံမြို့နယ်၊ ၇၈ လမ်း",
                nrcNo = "၉/မဆန(နိုင်)၇၇၈၈၉၉",
                emergencyContactName = "ဒေါ်ဇာခြည် (ဇနီး)",
                emergencyPhone = "09790112244",
                bloodType = "O+",
                skillLevel = "Foreman",
                paymentMethod = "KBZPay",
                paymentAccount = "0978912352",
                joinedDate = "2024-01-10"
            ),
            Worker(
                workerId = "W-109",
                name = "Ko Vikram (ပန်းရံ)",
                gender = "Male",
                workerType = "Mason",
                dailyRate = 30000.0,
                otRate = 4500.0,
                status = "Active",
                phone = "0978912353",
                address = "ရန်ကုန်တိုင်း၊ ရွှေပြည်သာမြို့နယ်၊ ဝါးတစ်ရာစက်မှုဇုန်",
                nrcNo = "၁၂/ရပသ(နိုင်)၈၈၉၉၀၀",
                emergencyContactName = "ကိုအောင်နိုင် (ညီ)",
                emergencyPhone = "09420223355",
                bloodType = "B+",
                skillLevel = "Skilled",
                paymentMethod = "WavePay",
                paymentAccount = "0978912353",
                joinedDate = "2024-03-01"
            ),
            Worker(
                workerId = "W-110",
                name = "Ko Sanjay (ဆေးသုတ်)",
                gender = "Male",
                workerType = "Painter",
                dailyRate = 25000.0,
                otRate = 3500.0,
                status = "Active",
                phone = "0978912354",
                address = "ပဲခူးတိုင်း၊ ပြည်မြို့နယ်၊ ဆံတော်ရပ်ကွက်",
                nrcNo = "၇/ပမန(နိုင်)၉၉၀၀၁၁",
                emergencyContactName = "ဒေါ်တင်တင်ဦး (ဇနီး)",
                emergencyPhone = "09250334466",
                bloodType = "O+",
                skillLevel = "Semi-Skilled",
                paymentMethod = "KBZPay",
                paymentAccount = "0978912354",
                joinedDate = "2024-04-18"
            ),
            Worker(
                workerId = "W-111",
                name = "Ko Deepak (ရေပိုက်)",
                gender = "Male",
                workerType = "Plumber",
                dailyRate = 30000.0,
                otRate = 4500.0,
                status = "Active",
                phone = "0978912355",
                address = "ရန်ကုန်တိုင်း၊ ဒဂုံမြို့သစ်မြောက်ပိုင်း၊ ၃၂ ရပ်ကွက်",
                nrcNo = "၁၂/ဒဂမ(နိုင်)၀၁၁၂၂၃",
                emergencyContactName = "ဒေါ်အေးအေးသင်း (ဇနီး)",
                emergencyPhone = "09960445577",
                bloodType = "A+",
                skillLevel = "Skilled",
                paymentMethod = "KBZPay",
                paymentAccount = "0978912355",
                joinedDate = "2024-02-14"
            ),
            Worker(
                workerId = "W-112",
                name = "U Manoj (သံချည်သံကွေး)",
                gender = "Male",
                workerType = "Bar Bender",
                dailyRate = 28000.0,
                otRate = 4000.0,
                status = "Inactive",
                phone = "0978912356",
                address = "ဧရာဝတီတိုင်း၊ ပုသိမ်မြို့နယ်၊ အမှတ် ၄ ရပ်ကွက်",
                nrcNo = "၁၄/ပသန(နိုင်)၁၂၂၃၃၄",
                emergencyContactName = "ဦးမြင့်အောင် (ဖခင်)",
                emergencyPhone = "09780556688",
                bloodType = "O-",
                skillLevel = "Skilled",
                paymentMethod = "Cash",
                paymentAccount = "",
                joinedDate = "2023-11-01"
            )
        )
    }

    fun getInitialSites(): List<Site> {
        return listOf(
            Site("S-01", "Metro Tower Phase 2 (ရန်ကုန်)", "Expressway, Sector 62", "U John Miller", "Ongoing"),
            Site("S-02", "Green Valley Luxury Villas", "North Dagon Plot 14", "U Rajesh Kumar", "Ongoing"),
            Site("S-03", "City Center Commercial Hub", "Pyay Road Junction", "Ko Vikram", "Ongoing"),
            Site("S-04", "Sunrise Residential Towers", "Hlaing Hillview", "U Sunil", "On Hold")
        )
    }

    fun getInitialAttendance(): List<AttendanceRecord> {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val calendar = Calendar.getInstance()

        val today = dateFormat.format(calendar.time)

        calendar.add(Calendar.DAY_OF_YEAR, -1)
        val yesterday = dateFormat.format(calendar.time)

        calendar.add(Calendar.DAY_OF_YEAR, -1)
        val twoDaysAgo = dateFormat.format(calendar.time)

        return listOf(
            // Today's records (S-01)
            AttendanceRecord(
                date = today,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-101",
                workerName = "Ko Rajesh (လက်သမား)",
                workerType = "Carpenter",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 28000.0,
                otHours = 2.0,
                otRate = 4000.0,
                advanceToday = 5000.0,
                paidToday = 0.0,
                remark = "Roof formwork framing (ခေါင်မိုးပုံစံ)"
            ),
            AttendanceRecord(
                date = today,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-102",
                workerName = "U Amit (ပန်းရံခေါင်းဆောင်)",
                workerType = "Mason",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 30000.0,
                otHours = 1.5,
                otRate = 4500.0,
                advanceToday = 0.0,
                paidToday = 20000.0,
                remark = "Main entrance brickwork (အုတ်စီခြင်း)"
            ),
            AttendanceRecord(
                date = today,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-103",
                workerName = "Ko Sunil (အကူ)",
                workerType = "Helper",
                morningAttendance = "P",
                eveningAttendance = "HD",
                dailyRate = 18000.0,
                otHours = 0.0,
                otRate = 2500.0,
                advanceToday = 3000.0,
                paidToday = 0.0,
                remark = "Mortar mixing & carrying (သရွတ်ဖျော်)"
            ),
            AttendanceRecord(
                date = today,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-106",
                workerName = "Daw Pooja (အကူ)",
                workerType = "Helper",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 18000.0,
                otHours = 1.0,
                otRate = 2500.0,
                advanceToday = 0.0,
                paidToday = 0.0,
                remark = "Scaffolding shifting (ငြမ်းရွှေ့ခြင်း)"
            ),
            // Yesterday's records
            AttendanceRecord(
                date = yesterday,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-101",
                workerName = "Ko Rajesh (လက်သမား)",
                workerType = "Carpenter",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 28000.0,
                otHours = 3.0,
                otRate = 4000.0,
                advanceToday = 0.0,
                paidToday = 28000.0,
                remark = "Column shuttering (တိုင်ပုံစံခတ်)"
            ),
            AttendanceRecord(
                date = yesterday,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-102",
                workerName = "U Amit (ပန်းရံခေါင်းဆောင်)",
                workerType = "Mason",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 30000.0,
                otHours = 2.0,
                otRate = 4500.0,
                advanceToday = 10000.0,
                paidToday = 0.0,
                remark = "Plaster work corridor (အင်္ဂတေချော)"
            ),
            AttendanceRecord(
                date = yesterday,
                siteCode = "S-02",
                siteName = "Green Valley Luxury Villas",
                workerId = "W-108",
                workerName = "U Aslam (လျှပ်စစ်ကျွမ်းကျင်)",
                workerType = "Electrician",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 35000.0,
                otHours = 2.0,
                otRate = 5000.0,
                advanceToday = 15000.0,
                paidToday = 0.0,
                remark = "Conduit wiring Villa 4 (ဝါယာလိုင်းသွင်း)"
            ),
            AttendanceRecord(
                date = yesterday,
                siteCode = "S-02",
                siteName = "Green Valley Luxury Villas",
                workerId = "W-104",
                workerName = "Ko Ramesh (အကူ)",
                workerType = "Helper",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 18000.0,
                otHours = 0.0,
                otRate = 2500.0,
                advanceToday = 0.0,
                paidToday = 18000.0,
                remark = "Chasing trench work"
            ),
            // 2 Days ago records
            AttendanceRecord(
                date = twoDaysAgo,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-101",
                workerName = "Ko Rajesh (လက်သမား)",
                workerType = "Carpenter",
                morningAttendance = "P",
                eveningAttendance = "P",
                dailyRate = 28000.0,
                otHours = 2.0,
                otRate = 4000.0,
                advanceToday = 5000.0,
                paidToday = 0.0,
                remark = "Beam framing"
            ),
            AttendanceRecord(
                date = twoDaysAgo,
                siteCode = "S-01",
                siteName = "Metro Tower Phase 2 (ရန်ကုန်)",
                workerId = "W-109",
                workerName = "Ko Vikram (ပန်းရံ)",
                workerType = "Mason",
                morningAttendance = "P",
                eveningAttendance = "HD",
                dailyRate = 30000.0,
                otHours = 0.0,
                otRate = 4500.0,
                advanceToday = 0.0,
                paidToday = 20000.0,
                remark = "Boundary wall (ခြံစည်းရိုးအုတ်တံတိုင်း)"
            )
        )
    }
}

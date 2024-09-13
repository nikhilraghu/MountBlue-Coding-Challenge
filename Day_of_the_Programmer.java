public static String dayOfProgrammer(int year) {
        int day = 256;
        int dayOfProgrammer;
        int month = 9; 
        
        if (year < 1918) { 
            if (year % 4 == 0) {
                dayOfProgrammer = 12; 
            } else {
                dayOfProgrammer = 13; 
            }
        } else if (year == 1918) { 
            dayOfProgrammer = 26; 
        } else { 
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                dayOfProgrammer = 12; 
            } else {
                dayOfProgrammer = 13;
            }
        }
        
        return String.format("%02d.09.%d", dayOfProgrammer, year);
    }

}

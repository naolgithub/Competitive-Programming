class Solution {
    String getMonth(String month) {
        if("Jan".equals(month)) {
            return "01";
        } else if("Feb".equals(month)) {
            return "02";
        } else if("Mar".equals(month)) {
            return "03";
        } else if("Apr".equals(month)) {
            return "04";
        } else if("May".equals(month)) {
            return "05";
        } else if("Jun".equals(month)) {
            return "06";
        } else if("Jul".equals(month)) {
            return "07";
        } else if("Aug".equals(month)) {
            return "08";
        } else if("Sep".equals(month)) {
            return "09";
        } else if("Oct".equals(month)) {
            return "10";
        } else if("Nov".equals(month)) {
            return "11";
        } 
        // else if("Dec".equals(month)) {
        //     return "12";
        // } 
        // return "00";
        else return "12";
    }    
	public String reformatDate(String date) {
        String[] day = date.split(" ");
        StringBuilder sb = new StringBuilder();
        
        sb.append(day[2]);
        
        sb.append("-");
        
        sb.append(getMonth(day[1]));
        
        sb.append("-");
        
        sb.append(day[0].length() == 4 ? day[0].substring(0, 2) :"0" + day[0].substring(0, 1));
        return sb.toString();
    }
}
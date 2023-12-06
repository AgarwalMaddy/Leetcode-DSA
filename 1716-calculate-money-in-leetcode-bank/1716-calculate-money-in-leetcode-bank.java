class Solution {
    public int totalMoney(int n) {
        int week = n / 7;
        int days = n % 7;
        if(week == 0){
            return (n * (n+1) / 2);
        }
        int weeklyAmount = weekMoney(week);
        if(days == 0){
            return weeklyAmount;
        }
        for(int i = week + 1; i <= week + days; i++){
            weeklyAmount += i;
        }

        return weeklyAmount;
    }
    
    public int weekMoney(int week){
        int weeklyAmount = 28;
        int totalAmount = 28;
        for(int i = 1 ; i < week; i++){
            totalAmount += (weeklyAmount + 7);
            weeklyAmount += 7;
        }

        return totalAmount;
    }
}
/* Her müşterinin geliş zamanı ve yemek pişirme süresine göre aşçının tamamladığı zamanı hesapladık. Ardından, her müşterinin bekleme süresini 
  toplayarak, ortalama bekleme süresini elde ettik. */

public class AverageWaitingTime{
  class Solution {
  public double averageWaitingTime(int[][] customers) {
    double totalWaitingTime = 0.0;
    int completionTime = 0;
    
    for (int[] customer : customers) {
      int arrivalTime = customer[0];
      int cookingTime = customer[1];
      
      completionTime = Math.max(completionTime, arrivalTime) + cookingTime;
      
      totalWaitingTime += completionTime - arrivalTime;
    }
    
    return totalWaitingTime / customers.length;
  }
}
}

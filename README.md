# MonthlySubscriptionCalculator

**Problem statement**
We want to build an intelligent system that can calculate the monthly subscription expenses ofessential items for a household. For the sake of this assignment, we will go with the dailynewspaper subscription. Following table demonstrate prices of some of the prominentnewspapers on a daily basis, all prices in Indian rupees.The input to the program should be a comma separated list of papers that the consumer wantsto subscribe.Calculate the total subscription price for the current month. ​You could use the calendar toarrive at the total number of specific weekdays in the month and hard code the same.

Price list:

Hindu[Mon,Tues,Wed,Thur,Fri,Sat,Sun]=[2.5 , 2.5 , 2.5 , 2.5 , 2.5 , 4 , 4]
TOI[Mon,Tues,Wed,Thur,Fri,Sat,Sun]=[3 , 3 , 3 , 3 , 3 , 5 , 6]

UseCase 1:

Customer subscribesTo -> Hindu [monthly] ,Times of India [monthly]
output : Rs.197.0

UseCase 2:

Customer subscribesTo -> Hindu [monthly] ,Times of India [Weekly]
output : Rs.111.0

Tech stack:
 JAVA,TestNG,Gradle

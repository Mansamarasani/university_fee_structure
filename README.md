# university_fee_structure
The following JSON represents a fee structure for courses in a university.
{
"Exam Fee":{
"INDIAN":{
"ALL_COURSES":{
"ALL_LEVEL":{
"amount":400
}
}
},
"FOREIGN":{
"ALL_COURSES":{
"ALL_LEVEL":{
"amount":100
}
}
},
"NRI":{
"ALL_COURSES":{
"ALL_LEVEL":{
"amount":600
}
}
},
"SAARC":{
"ALL_COURSES":{
"ALL_LEVEL":{
"amount":600
}
}
}
},
"Application Fee":{
"INDIAN":{
"ALL_COURSES":{
"UG":{
"amount":200
},
"UG­DIPLOMA":{
"amount":300
},
"PG":{
"amount":500
}
}
},
"FOREIGN":{
"ALL_COURSES":{
"UG":{
"amount":400
},
"UG­DIPLOMA":{
"amount":400
},
"PG":{
"amount":700
}
}
}
}
}
Write a program using any language / framework of your choice
that allows a user to determine the accurate fee to be paid
based on the JSON above.
Use Case:The user HASto select the fee first, after selecting
that, the program shows the list of associated nationalities
based on the inner keys of the selected fee. Once a nationality
is selected, it shows the list of courses for that fee /
nationality.
Note:If an entry is ALL_COURSES, then that needs to be
substituted with the following list, and one can be chosen.
Medical, Dental, Ayurveda
Once the course is selected, we select the level of the course
based on the previous selection.
Note:If an entry is ALL_LEVEL, then that needs to be
substituted with the following list, and one can be chosen.
UG, PG, DIPLOMA, Ph.D
Once all four options are selected, the resulting fee amount is
to be shown.
Other Details
Please use git to commit and push the code to a new repository
on github.com.
Please include a README.md file in the repository with
instructions on how to setup or run the code.

Open command prompt.
Run the created Java program using command prompt.
Follow the below steps to run the command prompt. 1
   1->  C:\Users\Admin> cd\
   2->  C:\> cd javaprogram
   3->  C:\javaprogram> javac University_fee_structure.java
   4->  C:\javaprogram> java University_fee_structure






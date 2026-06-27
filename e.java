[1mdiff --git a/Backend/Course.java b/Backend/Course.java[m
[1mindex 93570ce..d7d4170 100644[m
[1m--- a/Backend/Course.java[m
[1m+++ b/Backend/Course.java[m
[36m@@ -251,15 +251,20 @@[m [mpublic class Course implements Serializable, Schedulable {[m
     }[m
     [m
     @Override[m
[31m-    public void generateSchedule() {[m
[31m-        System.out.println("Course Class Schedule");[m
[31m-        System.out.println("Course Name : " +getCourseName());[m
[31m-        System.out.println("Course ID : " +getCourseID());[m
[31m-        System.out.println("Credit Hours : " +getCreditHours());[m
[31m-        System.out.println("Classroom : " +getAssignedClassroom().getName());[m
[31m-        System.out.println("Classroom Location : " +getAssignedClassroom().getLocation());[m
[31m-        System.out.println("Class TimeSlot : " +getTimeSlot());[m
[32m+[m[32mpublic void generateSchedule() {[m
[32m+[m[32m    if (getAssignedClassroom() == null) {[m
[32m+[m[32m        System.out.println("Schedule cannot be generated because no classroom has been assigned.");[m
[32m+[m[32m        return;[m
     }[m
[32m+[m
[32m+[m[32m    System.out.println("Course Class Schedule");[m
[32m+[m[32m    System.out.println("Course Name : " + getCourseName());[m
[32m+[m[32m    System.out.println("Course ID : " + getCourseID());[m
[32m+[m[32m    System.out.println("Credit Hours : " + getCreditHours());[m
[32m+[m[32m    System.out.println("Classroom : " + getAssignedClassroom().getName());[m
[32m+[m[32m    System.out.println("Classroom Location : " + getAssignedClassroom().getLocation());[m
[32m+[m[32m    System.out.println("Class TimeSlot : " + getTimeSlot());[m
[32m+[m[32m}[m
     [m
     //avaialability needs to be set to false first of the classroom [m
     //a reschedule method if a classroom undergoes some maintenance and has availability set to false[m

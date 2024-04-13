<?php

class OnlineCourse {
    private $title;
    private $instructor;
    private $duration;
    private $price;
    private $enrolledStudents = [];

    public function __construct($title, $instructor, $duration, $price) {
        $this->title = $title;
        $this->instructor = $instructor;
        $this->duration = $duration;
        $this->price = $price;
    }

    public function enrollStudent($studentName) {
        $this->enrolledStudents[] = $studentName;
        echo "$studentName has been enrolled in the course $this->title.<br>";
    }

    public function accessCourseMaterials($studentName) {
        if (in_array($studentName, $this->enrolledStudents)) {
            echo "$studentName is accessing the course materials for $this->title.<br>";
        } else {
            echo "$studentName is not enrolled in this course.<br>";
        }
    }

    public function trackProgress($studentName, $progress) {
        if (in_array($studentName, $this->enrolledStudents)) {
            echo "$studentName has made progress: $progress% completed.<br>";
        } else {
            echo "$studentName is not enrolled in this course.<br>";
        }
    }
    public function getTitle() {
        return $this->title;
    }

    public function getInstructor() {
        return $this->instructor;
    }

    public function getDuration() {
        return $this->duration;
    }

    public function getPrice() {
        return $this->price;
    }
}
$course = new OnlineCourse("Internet Programming", "Kalyani", "1 SEM", "81000");
$course->enrollStudent("Kalyani S");
$course->enrollStudent("S Kalyani");

$course->accessCourseMaterials("Kalyani S");
$course->accessCourseMaterials("SS Kalyani");

$course->trackProgress("Kalyani S", 30);
$course->trackProgress("S Kalyani", 50);

?>

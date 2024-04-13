<?php
    $weight = $_GET['t1'];
    $height = $_GET['t2'];
    $bmi = $weight / ($height * $height);
    if ($bmi < 18.5) {
        $category = "Underweight";
    } elseif ($bmi < 25) {
        $category = "Normal weight";
    } elseif ($bmi < 30) {
        $category = "Overweight";
    } else {
        $category = "Obese";
    }
    echo "Your BMI is: " .$bmi. "<br>";
    echo "BMI Category: ".$category;

?>

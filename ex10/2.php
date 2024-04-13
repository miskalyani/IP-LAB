<?php

function isPalindrome($number) {
    $originalNumber = $number;
    $reversedNumber = 0;

    while ($number > 0) {
        $digit = $number % 10;
        $reversedNumber = $reversedNumber * 10 + $digit;
        $number = (int)($number / 10);
    }

    if ($originalNumber == $reversedNumber) {
        return true;
    } else {
        return false;
    }
}
$number = $_GET['t1']; 
if (isPalindrome($number)) {
    echo "$number is a palindrome.";
} else {
    echo "$number is not a palindrome.";
}

?>

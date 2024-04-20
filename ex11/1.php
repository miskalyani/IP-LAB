<style>
    .error {
        color: red;
    }
</style>
<?php

$product_name_err = $description_err = $price_err = "";
$product_name = $description = $price = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (empty($_POST["product_name"])) {
        $product_name_err = "Product name is required";
    } else {
        $product_name = $_POST["product_name"];
    }
    if (empty($_POST["description"])) {
        $description_err = "Description is required";
    } else {
        $description = $_POST["description"];
    }
    if (empty($_POST["price"])) {
        $price_err = "Price is required";
    } else {
        $price = $_POST["price"];
        if (!is_numeric($price)) {
            $price_err = "Price must be a valid number";
        }
    }
 }
 ?>
 <form action="<?php $_SERVER["PHP_SELF"]; ?>" method="post">
    <label>Product Name:</label>
    <input type="text" name="t1">
    <span class="error"><?php echo $product_name_err; ?></span><br>

    <label>Description:</label>
    <input type="text" name="t2">
    <span class="error"><?php echo $description_err; ?></span><br>

    <label>Price:</label>
    <input type="text" name="t3">
    <span class="error"><?php echo $price_err; ?></span><br>

    <input type="submit" name="submit" value="Submit">
</form>
<?php
$host = 'localhost';
$user = 'root';
$pass = '';
$db = 'product';

$conn = new mysqli($host,$user,$pass,$db);
$na=$_POST['t1'];
$de=$_POST['t2'];
$pr=$_POST['t3'];

$sql = "insert into products values('$na','$de',$pr)";

if($conn->query($sql)=== True)
echo 'Row Inserted';
else
echo 'Not Inserted';

$conn->close();
?>

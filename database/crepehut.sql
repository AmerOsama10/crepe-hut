-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 07, 2023 at 04:58 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crepehut`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`username`, `password`) VALUES
('meto', 'meto');

-- --------------------------------------------------------

--
-- Table structure for table `cashiers`
--

CREATE TABLE `cashiers` (
  `cashier_id` int(11) NOT NULL,
  `cashier_name` varchar(100) NOT NULL,
  `cashier_phone` varchar(50) NOT NULL,
  `cashier_address` varchar(200) NOT NULL,
  `cashier_email` varchar(100) NOT NULL,
  `cashier_password` varchar(100) NOT NULL,
  `cashier_state` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cashiers`
--

INSERT INTO `cashiers` (`cashier_id`, `cashier_name`, `cashier_phone`, `cashier_address`, `cashier_email`, `cashier_password`, `cashier_state`) VALUES
(1, 'ميتو', '01282106151', 'طنطا', 'a', 'a', 0);

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `client_id` int(11) NOT NULL,
  `client_name` varchar(100) NOT NULL,
  `client_phone` varchar(50) NOT NULL,
  `client_address` varchar(200) NOT NULL,
  `client_notes` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`client_id`, `client_name`, `client_phone`, `client_address`, `client_notes`) VALUES
(22, 'سيد مختار النجار', '01271784980', 'بجوار مخزن الانابيب', ''),
(23, 'تامر باشا', '01211924673', 'ماركت باشا بجوار بنزينه رجب', 'لا'),
(24, 'احمد فيصل', '01201913634', '', ''),
(25, 'ايه عيد', '0142323134', 'بجوار معهد الفتيات عند مصنع جمال خفاحي', ''),
(28, 'ابراهيم سمير', '01274251255', 'طريق الكتان', ''),
(29, 'محمد محسن', '01284769595', 'صيدليه الدكتور احمد محسن', ''),
(30, 'لوئ عبعزيز', '01227039441', 'صيدليه صلاح دياب', ''),
(31, 'احمد', '01286218624', 'شبسي لا', ''),
(33, 'لوئ عبدالعزيز خالد', '01227039441', 'صيدليه صلاح دياب', ''),
(36, 'عامر متولي', '01121213', 'دمنهور باب اللوء الدور التاني شارع الحوامديه بالدقهليه جيزه مركز شباب ابو خالد الدالي عماره اتنين شقه 111الدور التاني', 'لا'),
(39, '', '', '', ''),
(40, 'احمد زكي', '', '', ''),
(41, 'احمد', '01286218624', 'محمد السباخي', ''),
(43, 'خالد العتربي', '012223223', '', ''),
(44, 'محمود', '134234234', 'نسيلتلنم', ''),
(45, 'الدسوقي خالد', '0123434334', 'المنصوره سيتي', ''),
(46, 'عامر', '012122212', '', ''),
(47, 'احمد', '', '', ''),
(49, 'سيد', '', '', ''),
(50, 'احمد', '0234', 'ش', '');

-- --------------------------------------------------------

--
-- Table structure for table `dates`
--

CREATE TABLE `dates` (
  `order_id` int(11) NOT NULL,
  `order_date` varchar(100) NOT NULL,
  `client_id` int(11) DEFAULT NULL,
  `cashier_id` int(11) NOT NULL,
  `order_egmaly` float NOT NULL DEFAULT 0,
  `order_service` int(11) NOT NULL DEFAULT 0,
  `order_total` float DEFAULT 0,
  `order_time` time NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dates`
--

INSERT INTO `dates` (`order_id`, `order_date`, `client_id`, `cashier_id`, `order_egmaly`, `order_service`, `order_total`, `order_time`) VALUES
(1, '07 April 2023', NULL, 1, 51, 0, 51, '16:15:02'),
(2, '07 April 2023', NULL, 1, 25, 0, 25, '16:16:05'),
(3, '07 April 2023', NULL, 1, 33, 0, 33, '16:16:48'),
(4, '07 April 2023', NULL, 1, 195, 0, 195, '16:17:15'),
(5, '07 April 2023', NULL, 1, 218, 0, 218, '16:17:36');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_id` int(11) NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `item_size` varchar(50) NOT NULL,
  `item_cost` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_id`, `item_name`, `item_size`, `item_cost`) VALUES
(1, 'كريب شيش طاووق', '', 25),
(2, 'كريب شنغهاي', '', 25),
(3, 'كريب كوردن بلو', '', 25),
(4, 'كريب فاهيتا فراخ', '', 26),
(5, 'كريب سوبر كرانشي', '', 24),
(6, 'كريب مشوي صدور', '', 25),
(7, 'كريب بانيه', '', 23),
(8, 'كريب زنجر سوبريم', '', 25),
(9, 'كريب كونو بيتزا', '', 28),
(10, 'كريب كونو', '', 25),
(11, 'كريب ايطاليانو', '', 26),
(12, 'كريب كرسبي', '', 23),
(13, 'كريب شاورما فراخ', ' ', 25),
(14, 'كريب فرايداي', '', 28),
(15, 'كريب العالمي', '', 33),
(16, 'كريب كوكتيل فراخ', '', 33),
(17, 'كريب مشكل ميكس', '', 28),
(18, 'كريب جوليانو', '', 28),
(19, 'كريب فراخ ميكس', '', 19),
(20, 'كريب الجحيم', '', 33),
(21, 'كريب توربيني فراخ', '', 35),
(22, 'اضافه فراخ', '', 10),
(23, 'اضافه مشروم', '', 10),
(24, 'باكيت بطاطس', '', 10),
(25, 'كريب سجق', '', 18),
(26, 'كريب كفته', '', 15),
(27, 'كريب سوسيس', '', 15),
(28, 'كريب شاورما لحم', '', 25),
(29, 'كريب برجر', '', 17),
(30, 'كريب ميكسيكانو', '', 23),
(31, 'كريب كوكتيل لحم', '', 27),
(32, 'كريب توربيني لحم', '', 25),
(33, 'كريب سوبر دويتو لحوم', '', 21),
(34, 'كريب ميكس شاورما', '', 25),
(35, 'كريب مشروم', '', 20),
(36, 'اضافه لحم', '', 10),
(37, 'كريب جمبري مشوي', '', 33),
(38, 'كريب سي فود بلاس', '', 38),
(39, 'اضافه جبن', '', 7),
(40, 'كريب ميكس جبن بالبسطرمه', '', 30),
(41, 'كريب مشكل جبن', '', 25),
(42, 'كريب رومي', '', 20),
(43, 'اضافه بوم فريت', '', 5),
(44, 'كريب بطاطس شيدر', '', 23),
(45, 'كريب بطاطس', '', 20),
(46, 'كريب شيكولاته اوريو', '', 25),
(47, 'كريب شيكولاته هوهوز', '', 25),
(48, 'كريب شيكولاته ', '', 20),
(49, 'اضافه شيكولاته', '', 10),
(50, 'كريب شيكولاته موز', '', 25),
(51, 'كريب شيكولاته جلاكسي', '', 30),
(52, 'كنز بيبسي', '', 5),
(53, ' كولوسلو', '', 5),
(54, 'باكيت بطاطس كبير', '', 15),
(55, 'مخلل', '', 5),
(56, 'كريب جديد ميكس', '', 40),
(57, 'كريب نص كيلو ميكس', '', 70),
(58, 'كريب نص كيلو لحوم', '', 65),
(59, 'كريب نص كيلو فراخ', '', 65),
(60, 'كريب ناجيتس', '', 35),
(61, 'كريب تشيكن استربس', '', 45),
(62, 'كريب اباتشي', '', 35),
(63, 'كريب لحمه مشوي', '', 50),
(64, 'كريب تشيكن مشروم', '', 40),
(65, 'كريب كوردن بلو سوسيس', '', 45),
(66, 'كومبو', '', 18);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `order_quantity` int(11) NOT NULL DEFAULT 1,
  `item_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `order_quantity`, `item_id`) VALUES
(1, 1, 3),
(1, 1, 4),
(2, 1, 2),
(3, 1, 54),
(3, 1, 66),
(4, 1, 54),
(4, 10, 66),
(5, 1, 53),
(5, 3, 59),
(5, 1, 66);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `cashiers`
--
ALTER TABLE `cashiers`
  ADD PRIMARY KEY (`cashier_id`),
  ADD UNIQUE KEY `cashier_email` (`cashier_email`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`client_id`);

--
-- Indexes for table `dates`
--
ALTER TABLE `dates`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `cashier_id` (`cashier_id`),
  ADD KEY `client_id` (`client_id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`item_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`,`item_id`),
  ADD KEY `item_id` (`item_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashiers`
--
ALTER TABLE `cashiers`
  MODIFY `cashier_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `client_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=212;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=207;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dates`
--
ALTER TABLE `dates`
  ADD CONSTRAINT `dates_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  ADD CONSTRAINT `dates_ibfk_2` FOREIGN KEY (`cashier_id`) REFERENCES `cashiers` (`cashier_id`),
  ADD CONSTRAINT `dates_ibfk_3` FOREIGN KEY (`client_id`) REFERENCES `clients` (`client_id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

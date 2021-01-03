-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2018 at 06:45 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiffinwiffin`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `email_id` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`email_id`, `password`) VALUES
('s@gmail.com', '1234567');

-- --------------------------------------------------------

--
-- Table structure for table `cust_details`
--

CREATE TABLE `cust_details` (
  `cust_id` int(5) NOT NULL,
  `email_id` varchar(50) NOT NULL,
  `password` varchar(15) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `contact_no` bigint(11) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cust_details`
--

INSERT INTO `cust_details` (`cust_id`, `email_id`, `password`, `name`, `contact_no`, `address`) VALUES
(17, 'k@gmail.com', '1234567', 'krina', 10101010, 'ahhaahahah'),
(15, 'lolmlol2611@gmail.com', NULL, 'lol lol', 121243, 'dwdad'),
(16, 'shahshivam2611@gmail.com', NULL, 'Shivam Shah', 21212121, 'effeffw'),
(12, 'shivam@gmail.com', '1234567', 'Shiva', 9033455118, '255, Anandnagar');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `message` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`name`, `email`, `message`) VALUES
('Shivam', 's@gmail.com', 'dawdadwdaffafwfawfawfwffwf');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(10) NOT NULL,
  `cust_id` int(10) NOT NULL,
  `plan_id` int(10) NOT NULL,
  `start_date` varchar(10) NOT NULL,
  `end_date` varchar(10) NOT NULL,
  `quantity` int(10) NOT NULL,
  `order_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `cust_id`, `plan_id`, `start_date`, `end_date`, `quantity`, `order_total`) VALUES
(1, 12, 3, '19/11/2018', '19/12/2018', 2, 3600),
(2, 16, 6, '26/11/2018', '26/12/2018', 3, 5700),
(3, 12, 3, '26/11/2018', '26/12/2018', 2, 3600),
(4, 16, 3, '19/11/2018', '19/12/2018', 10, 18000),
(5, 17, 5, '19/11/2018', '26/11/2018', 2, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `plans`
--

CREATE TABLE `plans` (
  `plan_id` int(2) NOT NULL,
  `plan_name` varchar(50) NOT NULL,
  `plan_duration` int(3) NOT NULL,
  `plan_price` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `plans`
--

INSERT INTO `plans` (`plan_id`, `plan_name`, `plan_duration`, `plan_price`) VALUES
(1, 'Gujarati-Daily', 1, 80),
(2, 'Gujarati-Weekly', 7, 450),
(3, 'Gujarati-Monthly', 30, 1800),
(4, 'Punjabi-Daily', 1, 90),
(5, 'Punjabi-Weekly', 7, 500),
(6, 'Punjabi-Monthly', 30, 1900);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`email_id`);

--
-- Indexes for table `cust_details`
--
ALTER TABLE `cust_details`
  ADD PRIMARY KEY (`email_id`),
  ADD UNIQUE KEY `cust_id` (`cust_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `cust_fk` (`cust_id`),
  ADD KEY `plan_fk` (`plan_id`);

--
-- Indexes for table `plans`
--
ALTER TABLE `plans`
  ADD PRIMARY KEY (`plan_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cust_details`
--
ALTER TABLE `cust_details`
  MODIFY `cust_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `cust_fk` FOREIGN KEY (`cust_id`) REFERENCES `cust_details` (`cust_id`),
  ADD CONSTRAINT `plan_fk` FOREIGN KEY (`plan_id`) REFERENCES `plans` (`plan_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

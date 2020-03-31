-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 25, 2019 at 05:36 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Register`
--

-- --------------------------------------------------------

--
-- Table structure for table `Admin`
--

CREATE TABLE `Admin` (
  `IcasNo` int(6) NOT NULL,
  `UniqueID` varchar(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `Surname` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ArnoldMubaiwa`
--

CREATE TABLE `ArnoldMubaiwa` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `JessicasChimex`
--

CREATE TABLE `JessicasChimex` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Lecturers`
--

CREATE TABLE `Lecturers` (
  `LecturerNumber` int(6) NOT NULL,
  `UniqueNumber` varchar(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `Surname` varchar(25) NOT NULL,
  `Faculty` varchar(10) NOT NULL,
  `ContactNumber` varchar(10) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `TableName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Lecturers`
--

INSERT INTO `Lecturers` (`LecturerNumber`, `UniqueNumber`, `Name`, `Surname`, `Faculty`, `ContactNumber`, `Email`, `TableName`) VALUES
(12345, '1215898880', 'Phumlani', 'sdfghjk', 'sdfghjkl', '0215587414', 'phumlanimthembu@gmail.com', 'Phumlanisdfghjk'),
(123434, '1215898880', 'Arnold', 'Mubaiwa', 'MICT', '0642681132', 'arnoldmubaiwa99@gmail.com', 'ArnoldMubaiwa'),
(145879, '1215898880', 'Jessicas', 'Chimex', 'MICT', '0645891132', 'adfaghadh@gmail.com', 'JessicasChimex'),
(147855, '3406874373', 'poiuytr', 'uiopoi', 'MICT', '0645891132', 'adfaghadh@gmail.com', 'poiuytruiopoi'),
(250123, '567475773', 'qwertyu', 'wertyui', 'MICT', '0645894451', 'adfaghadh@gmail.com', 'qwertyuwertyui'),
(325568, '1186936348', 'sdfghjk', 'sdfghjk', 'MICT', '0645891132', 'adfaghadh@gmail.com', 'sdfghjksdfghjk');

-- --------------------------------------------------------

--
-- Table structure for table `Phumlanisdfghjk`
--

CREATE TABLE `Phumlanisdfghjk` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `poiuytruiopoi`
--

CREATE TABLE `poiuytruiopoi` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `qwertyuwertyui`
--

CREATE TABLE `qwertyuwertyui` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sdfghjksdfghjk`
--

CREATE TABLE `sdfghjksdfghjk` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Students`
--

CREATE TABLE `Students` (
  `StudentNumber` int(11) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `Surname` varchar(25) NOT NULL,
  `Faculty` varchar(20) NOT NULL,
  `Qualification` varchar(20) NOT NULL,
  `YearOfStudy` int(1) NOT NULL,
  `ContactNumber` int(10) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `GuardianContactNo` int(10) NOT NULL,
  `GuardianEmailAd` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Students`
--

INSERT INTO `Students` (`StudentNumber`, `Name`, `Surname`, `Faculty`, `Qualification`, `YearOfStudy`, `ContactNumber`, `Email`, `GuardianContactNo`, `GuardianEmailAd`) VALUES
(111111, 'Arnold', 'Mubaiwa', 'MICT', 'DIT 3 YEARS', 3, 642681132, 'ASDFGHJKL', 837393500, 'arnoldmubaiwa99@gmail.com'),
(123456, 'Arnold', 'Mubaiwa', 'sdr', 'DIT 3 YEARS', 5, 879114784, 'tinashemutyaso@gmail.com', 837393500, 'arnoldmubaiwa99@gmail.com'),
(123457, 'Phumlani', 'Mthembu', 'QWERT', 'DIT 2 YEAR', 2, 836681478, 'ASDFGHJKL', 7119449, ''),
(223311, 'Phumlani', 'Johns', 'MICT', 'DIT 2 YEAR', 2, 642681132, 'tinashemutyaso@gmail.com', 875562123, 'arnoldmubaiwa99@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `wertyuiJohns`
--

CREATE TABLE `wertyuiJohns` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wertyuipoiuy`
--

CREATE TABLE `wertyuipoiuy` (
  `StudentNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Surname` varchar(30) DEFAULT NULL,
  `Faculty` varchar(30) NOT NULL,
  `YearOfStudy` varchar(30) NOT NULL,
  `DateOfAttendance` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ArnoldMubaiwa`
--
ALTER TABLE `ArnoldMubaiwa`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `JessicasChimex`
--
ALTER TABLE `JessicasChimex`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `Lecturers`
--
ALTER TABLE `Lecturers`
  ADD PRIMARY KEY (`LecturerNumber`);

--
-- Indexes for table `Phumlanisdfghjk`
--
ALTER TABLE `Phumlanisdfghjk`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `poiuytruiopoi`
--
ALTER TABLE `poiuytruiopoi`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `qwertyuwertyui`
--
ALTER TABLE `qwertyuwertyui`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `sdfghjksdfghjk`
--
ALTER TABLE `sdfghjksdfghjk`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `Students`
--
ALTER TABLE `Students`
  ADD PRIMARY KEY (`StudentNumber`);

--
-- Indexes for table `wertyuiJohns`
--
ALTER TABLE `wertyuiJohns`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `wertyuipoiuy`
--
ALTER TABLE `wertyuipoiuy`
  ADD PRIMARY KEY (`StudentNo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

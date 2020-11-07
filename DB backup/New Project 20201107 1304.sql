-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.30-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema kcc_tshirt
--

CREATE DATABASE IF NOT EXISTS kcc_tshirt;
USE kcc_tshirt;

--
-- Definition of table `sell_info`
--

DROP TABLE IF EXISTS `sell_info`;
CREATE TABLE `sell_info` (
  `sell_info_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sell_info_buyer_name` varchar(450) DEFAULT NULL,
  `sell_info_address` varchar(450) DEFAULT NULL,
  `sell_info_contact1` varchar(45) DEFAULT NULL,
  `sell_info_contact2` varchar(45) DEFAULT NULL,
  `sell_info_contact3` varchar(45) DEFAULT NULL,
  `sell_info_size` varchar(45) DEFAULT NULL,
  `sell_info_wrist_band_count` int(10) unsigned DEFAULT NULL,
  `sell_info_cap_count` int(10) unsigned DEFAULT NULL,
  `sell_info_payment_method` varchar(100) DEFAULT NULL,
  `sell_info_delivery_status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sell_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sell_info`
--

/*!40000 ALTER TABLE `sell_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `sell_info` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

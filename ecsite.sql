-- MySQL dump 10.16  Distrib 10.1.29-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: ecsite
-- ------------------------------------------------------
-- Server version	10.1.29-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `item_info_transaction`
--

DROP TABLE IF EXISTS `item_info_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_info_transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(30) DEFAULT NULL,
  `item_price` int(11) DEFAULT NULL,
  `item_stock` int(11) DEFAULT NULL,
  `item_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_info_transaction`
--

LOCK TABLES `item_info_transaction` WRITE;
/*!40000 ALTER TABLE `item_info_transaction` DISABLE KEYS */;
INSERT INTO `item_info_transaction` VALUES (1,'ノートBook',100,50,NULL,NULL);
/*!40000 ALTER TABLE `item_info_transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_user_transaction`
--

DROP TABLE IF EXISTS `login_user_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_user_transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` varchar(16) DEFAULT NULL,
  `login_pass` varchar(16) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `insert_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_id` (`login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_user_transaction`
--

LOCK TABLES `login_user_transaction` WRITE;
/*!40000 ALTER TABLE `login_user_transaction` DISABLE KEYS */;
INSERT INTO `login_user_transaction` VALUES (1,'internous','internous01','test',NULL,NULL),(2,'musicology','ema567','yeah8','2018-02-28 14:17:42',NULL);
/*!40000 ALTER TABLE `login_user_transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_buy_item_transaction`
--

DROP TABLE IF EXISTS `user_buy_item_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_buy_item_transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_transaction_id` int(11) DEFAULT NULL,
  `total_price` int(11) DEFAULT NULL,
  `total_count` int(11) DEFAULT NULL,
  `user_master_id` varchar(16) DEFAULT NULL,
  `pay` varchar(30) DEFAULT NULL,
  `insert_date` datetime DEFAULT NULL,
  `delete_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_buy_item_transaction`
--

LOCK TABLES `user_buy_item_transaction` WRITE;
/*!40000 ALTER TABLE `user_buy_item_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_buy_item_transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-28 14:46:32

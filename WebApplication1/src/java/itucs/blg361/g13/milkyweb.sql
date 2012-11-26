CREATE DATABASE  IF NOT EXISTS `milkyweb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci */;
USE `milkyweb`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: milkyweb
-- ------------------------------------------------------
-- Server version	5.5.28

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
-- Table structure for table `agent`
--

DROP TABLE IF EXISTS `agent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `surname` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `company` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `comAddress` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `comTel` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `buySell` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agent`
--

LOCK TABLES `agent` WRITE;
/*!40000 ALTER TABLE `agent` DISABLE KEYS */;
INSERT INTO `agent` VALUES (1,'Ahmet','A','Levent','Levent Büyük Çarşı','12345',NULL),(2,'Mehmet','M','4Levent','4Levent Metro','23456',NULL);
/*!40000 ALTER TABLE `agent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrdepartment`
--

DROP TABLE IF EXISTS `hrdepartment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrdepartment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `surname` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `mobilePhone` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `address` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `position` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `experience` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrdepartment`
--

LOCK TABLES `hrdepartment` WRITE;
/*!40000 ALTER TABLE `hrdepartment` DISABLE KEYS */;
INSERT INTO `hrdepartment` VALUES (1,'yeni','calisan','yeni@calisan.com','678','Suleymaniye','çalışan','eker sütte 2 senelik tecrübe'),(2,'diğer yeni','calisan','digeryeni@calisan.com','123','hadımköy','çalışan','pınar sütte 3 senelik tecrübe');
/*!40000 ALTER TABLE `hrdepartment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `surName` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `mobilePhone` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `address` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `position` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `salary` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `userType` int(11) DEFAULT '4',
  `userName` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `password` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Süleyman','S','3456','suleym@suleym.com','Süleymanın yeri','Müdür','2000',1,'suley','suley'),(2,'Cevdet','C','123667','cevdet@cevdet.com','Cevdetin Evi','Müdür yardımcısı','1500',1,'cevdet','cevdet'),(3,'Cavit','Ca','4567','cavit@cavit.com','Cavitin mahallesi','Bayii',NULL,3,'cavit','cavit'),(4,'Cahit','Cah','123','cahit@cahit.com','Caihitn mekanı','Çalışan','1000',2,'cahit','cahit');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-11-26 14:38:08

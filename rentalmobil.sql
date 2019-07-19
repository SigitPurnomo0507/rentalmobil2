-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Jul 2019 pada 05.48
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_jenis_mobil`
--

CREATE TABLE `tb_jenis_mobil` (
  `kd_jenis` char(10) NOT NULL,
  `nama_jenis` varchar(20) NOT NULL,
  `fasilitas` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_jenis_mobil`
--

INSERT INTO `tb_jenis_mobil` (`kd_jenis`, `nama_jenis`, `fasilitas`) VALUES
('MB001', 'EXECUTIVE', 'FULL AC & MUSIC'),
('MB002', 'REGULAR', 'FULL AC'),
('MB003', 'BIASA', 'NON AC & MUSIC');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_login`
--

CREATE TABLE `tb_login` (
  `username` varchar(10) NOT NULL,
  `password` varchar(15) NOT NULL,
  `hak_akses` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mobil`
--

CREATE TABLE `tb_mobil` (
  `kd_mobil` char(11) NOT NULL,
  `kd_jenis` char(11) NOT NULL,
  `nama_mobil` varchar(25) NOT NULL,
  `harga_sewa` int(11) NOT NULL,
  `harga_denda` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `satuan` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_mobil`
--

INSERT INTO `tb_mobil` (`kd_mobil`, `kd_jenis`, `nama_mobil`, `harga_sewa`, `harga_denda`, `stock`, `satuan`) VALUES
('MBL001', 'MB001', 'ALPHARD', 500000, 300000, 11, 'UNIT');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `no_transaksi` char(25) NOT NULL,
  `kd_mobil` varchar(30) NOT NULL,
  `harga_sewa` int(11) NOT NULL,
  `lama_sewa` int(11) NOT NULL,
  `total_bayar` int(11) NOT NULL,
  `kd_user` varchar(10) NOT NULL,
  `nama_user` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`no_transaksi`, `kd_mobil`, `harga_sewa`, `lama_sewa`, `total_bayar`, `kd_user`, `nama_user`) VALUES
('888', 'MBL001', 500000, 2, 1000000, 'U001', 'SIGIT'),
('997', 'MBL001', 500000, 3, 1500000, 'U001', 'SIGIT');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_transaksi_pengembalian`
--

CREATE TABLE `tb_transaksi_pengembalian` (
  `no_transaksi` char(25) NOT NULL,
  `kd_mobil` varchar(30) NOT NULL,
  `harga_sewa` int(11) NOT NULL,
  `lama_sewa` int(11) NOT NULL,
  `total_bayar` int(11) NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembali` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_transaksi_pengembalian`
--

INSERT INTO `tb_transaksi_pengembalian` (`no_transaksi`, `kd_mobil`, `harga_sewa`, `lama_sewa`, `total_bayar`, `bayar`, `kembali`) VALUES
('998', 'MBL001', 500000, 2, 1000000, 20000000, 19000000),
('876', 'MBL001', 500000, 5, 2500000, 300000000, 297500000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `kd_user` varchar(10) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `jenis_user` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `email` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`kd_user`, `nama_user`, `jenis_user`, `password`, `no_telp`, `email`) VALUES
('U001', 'admin', 'ADMIN', 'admin', '081802457510', 'Sigitmasaid@gmail.com'),
('U002', 'operator', 'OPERATOR', 'operator', '081802457501', 'Purnomo@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_jenis_mobil`
--
ALTER TABLE `tb_jenis_mobil`
  ADD PRIMARY KEY (`kd_jenis`);

--
-- Indeks untuk tabel `tb_login`
--
ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `tb_mobil`
--
ALTER TABLE `tb_mobil`
  ADD PRIMARY KEY (`kd_mobil`),
  ADD KEY `kd_jenis_mobil` (`kd_jenis`);

--
-- Indeks untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `kd_mobil` (`kd_mobil`),
  ADD KEY `kd_user` (`kd_user`);

--
-- Indeks untuk tabel `tb_transaksi_pengembalian`
--
ALTER TABLE `tb_transaksi_pengembalian`
  ADD KEY `kd_mobil` (`kd_mobil`),
  ADD KEY `no_transaksi` (`no_transaksi`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`kd_user`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_mobil`
--
ALTER TABLE `tb_mobil`
  ADD CONSTRAINT `tb_mobil_ibfk_1` FOREIGN KEY (`kd_jenis`) REFERENCES `tb_jenis_mobil` (`kd_jenis`),
  ADD CONSTRAINT `tb_mobil_ibfk_2` FOREIGN KEY (`kd_mobil`) REFERENCES `tb_transaksi` (`kd_mobil`);

--
-- Ketidakleluasaan untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD CONSTRAINT `tb_transaksi_ibfk_1` FOREIGN KEY (`kd_mobil`) REFERENCES `tb_transaksi_pengembalian` (`kd_mobil`),
  ADD CONSTRAINT `tb_transaksi_ibfk_2` FOREIGN KEY (`kd_user`) REFERENCES `tb_user` (`kd_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

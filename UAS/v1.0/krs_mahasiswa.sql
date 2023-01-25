-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 23 Jan 2023 pada 07.25
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `krs_mahasiswa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_detailkrs`
--

CREATE TABLE `tbl_detailkrs` (
  `id_pengambilan` int(11) NOT NULL,
  `nim` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `id_matkul` int(11) NOT NULL,
  `jumlah_sks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_detailkrs`
--

INSERT INTO `tbl_detailkrs` (`id_pengambilan`, `nim`, `nama`, `id_matkul`, `jumlah_sks`) VALUES
(3043, 20210120, 'Nazar', 106, 4),
(3056, 20230120, 'Nazar', 109, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_mahasiswa`
--

CREATE TABLE `tbl_mahasiswa` (
  `nim` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `ypass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_mahasiswa`
--

INSERT INTO `tbl_mahasiswa` (`nim`, `nama`, `ypass`) VALUES
(20230120, 'Nazar', 'nazar123'),
(20230804, 'Tiara', 'tiara123'),
(20230883, 'Ihsan', 'ihsan123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_matakuliah`
--

CREATE TABLE `tbl_matakuliah` (
  `id_matkul` int(11) NOT NULL,
  `nama_matkul` varchar(100) NOT NULL,
  `sks` int(11) NOT NULL,
  `matkul_smt` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_matakuliah`
--

INSERT INTO `tbl_matakuliah` (`id_matkul`, `nama_matkul`, `sks`, `matkul_smt`) VALUES
(101, 'Basis Data', 3, 3),
(102, 'Pemrograman Berorientasi Objek', 4, 3),
(103, 'Rekayasa Perangkat Lunak', 2, 3),
(104, 'Kalkulus', 3, 2),
(105, 'Logika Informatika', 3, 2),
(106, 'Algoritma dan Struktur data', 4, 2),
(107, 'Aljabar Linear', 3, 1),
(108, 'Dasar Pemrograman', 4, 1),
(109, 'Bahasa Inggris Umum', 2, 1);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbl_detailkrs`
--
ALTER TABLE `tbl_detailkrs`
  ADD PRIMARY KEY (`id_pengambilan`),
  ADD KEY `nim` (`nim`),
  ADD KEY `id_matkul` (`id_matkul`);

--
-- Indeks untuk tabel `tbl_mahasiswa`
--
ALTER TABLE `tbl_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `tbl_matakuliah`
--
ALTER TABLE `tbl_matakuliah`
  ADD PRIMARY KEY (`id_matkul`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tbl_detailkrs`
--
ALTER TABLE `tbl_detailkrs`
  MODIFY `id_pengambilan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3057;

--
-- AUTO_INCREMENT untuk tabel `tbl_matakuliah`
--
ALTER TABLE `tbl_matakuliah`
  MODIFY `id_matkul` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

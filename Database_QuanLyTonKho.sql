CREATE DATABASE QuanLyKhoHang;
GO

USE QuanLyKhoHang;
GO

-- Tạo bảng SanPham
CREATE TABLE SanPham (
    MaSanPham VARCHAR(10) not null PRIMARY KEY,
    TenSanPham NVARCHAR(100),
    TenLoaiSanPham NVARCHAR(100),
    DonViTinh NVARCHAR(50),
    ChiTiet NVARCHAR(255)
);

-- Tạo bảng NguoiBan
CREATE TABLE NguoiBan (
    MaNguoiBan VARCHAR(10) not null PRIMARY KEY,
    TenNguoiBan NVARCHAR(100),
    SDT VARCHAR(15),
    DiaChi NVARCHAR(255)
);

-- Tạo bảng DonNhapHang
CREATE TABLE DonNhapHang (
    MaDonNhap VARCHAR(10) not null PRIMARY KEY,
    MaNguoiBan VARCHAR(10) FOREIGN KEY REFERENCES NguoiBan(MaNguoiBan),
    NgayTao DATE,
    TongGiaTri DECIMAL(15, 2)
);

-- Tạo bảng KhoHang
CREATE TABLE KhoHang (
    MaKhoHang VARCHAR(10) not null PRIMARY KEY,
    TenKhoHang NVARCHAR(100),
    DiaChi NVARCHAR(255)
);

-- Tạo bảng ChiTietTonKho
CREATE TABLE ChiTietTonKho (
    MaChiTietTonKho VARCHAR(10) not null PRIMARY KEY,
    MaSanPham VARCHAR(10) FOREIGN KEY REFERENCES SanPham(MaSanPham),
    MaKhoHang VARCHAR(10) FOREIGN KEY REFERENCES KhoHang(MaKhoHang),
    SoLuongTonKho INT
);

-- Tạo bảng NguoiMua
CREATE TABLE NguoiMua (
    MaNguoiMua VARCHAR(10) not null PRIMARY KEY,
    TenNguoiMua NVARCHAR(100),
    SDT VARCHAR(15),
    DiaChi NVARCHAR(255)
);

-- Tạo bảng DonXuatHang
CREATE TABLE DonXuatHang (
    MaDonXuat VARCHAR(10) not null PRIMARY KEY,
    MaNguoiMua VARCHAR(10) FOREIGN KEY REFERENCES NguoiMua(MaNguoiMua),
    NgayTao DATE,
    TongGiaTri DECIMAL(15, 2)
);

-- Tạo bảng ChiTietDonNhapHang
CREATE TABLE ChiTietDonNhapHang (
    MaChiTietDonNhap VARCHAR(10) not null PRIMARY KEY,
    MaDonNhap VARCHAR(10) FOREIGN KEY REFERENCES DonNhapHang(MaDonNhap),
    MaSanPham VARCHAR(10) FOREIGN KEY REFERENCES SanPham(MaSanPham),
    SoLuong INT,
    DonGia DECIMAL(15, 2)
);

-- Tạo bảng ChiTietDonXuatHang
CREATE TABLE ChiTietDonXuatHang (
    MaChiTietXuatHang VARCHAR(10) not null PRIMARY KEY,
    MaDonXuat VARCHAR(10) FOREIGN KEY REFERENCES DonXuatHang(MaDonXuat),
    MaSanPham VARCHAR(10) FOREIGN KEY REFERENCES SanPham(MaSanPham),
    SoLuong INT,
    DonGia DECIMAL(15, 2)
);
GO



-------Tạo dữ liệu mẫu------
--KhoHang
insert into KhoHang values ('K1','Kho 1',N'164 Ngô Gia Tự, Phường 16, QUận 8, Tp.HCM');
insert into KhoHang values ('K2','Kho 2',N'169 Ngô Gia Tự, Phường 16, QUận 8, Tp.HCM');



-----------------------------
select* from KhoHang

CREATE DATABASE QuanLyKhoHang;
GO

USE QuanLyKhoHang;
GO

-- Tạo bảng SanPham
CREATE TABLE SanPham (
    MaSanPham NVARCHAR(100) not null PRIMARY KEY,
    TenSanPham NVARCHAR(100),
    TenLoaiSanPham NVARCHAR(100),
    DonViTinh NVARCHAR(20),
    ChiTiet NVARCHAR(512)
);

-- Tạo bảng KhoHang
CREATE TABLE KhoHang (
    MaKhoHang NVARCHAR(100) not null PRIMARY KEY,
    TenKhoHang NVARCHAR(100),
    DiaChi NVARCHAR(100)
);

-- Tạo bảng DonNhapHang
CREATE TABLE DonNhapHang (
    MaDonNhap NVARCHAR(100) not null PRIMARY KEY,
	MaKhoHang NVARCHAR(100) FOREIGN KEY REFERENCES KhoHang(MaKhoHang),
    TenNguoiBan NVARCHAR(100),
    NgayTao DATE,
    TongGiaTri float
);



-- Tạo bảng ChiTietTonKho
CREATE TABLE ChiTietTonKho (
    MaChiTietTonKho int not null identity(1,1) PRIMARY KEY,
	MaKhoHang NVARCHAR(100) FOREIGN KEY REFERENCES KhoHang(MaKhoHang),
    MaSanPham NVARCHAR(100) FOREIGN KEY REFERENCES SanPham(MaSanPham),
	TenSanPham NVARCHAR(100),

    SoLuongTonKho float
);

-- Tạo bảng NguoiMua


-- Tạo bảng DonXuatHang
CREATE TABLE DonXuatHang (
    MaDonXuat NVARCHAR(100) not null PRIMARY KEY,
    TenNguoiMua NVARCHAR(100),
    NgayTao DATE,
    TongGiaTri float
);

-- Tạo bảng ChiTietDonNhapHang
CREATE TABLE ChiTietDonNhapHang (
    MaChiTietDonNhap int not null identity(1,1) PRIMARY KEY, -- tạo tự động để không phải nhập liệu trong form
    MaDonNhap NVARCHAR(100) FOREIGN KEY REFERENCES DonNhapHang(MaDonNhap),
    MaSanPham NVARCHAR(100) FOREIGN KEY REFERENCES SanPham(MaSanPham),
    SoLuong float,
    DonGia float
);

-- Tạo bảng ChiTietDonXuatHang
CREATE TABLE ChiTietDonXuatHang (
    MaChiTietXuatHang   int not null identity(1,1) PRIMARY KEY, -- tạo tự động để không phải nhập liệu trong form
    MaDonXuat NVARCHAR(100) FOREIGN KEY REFERENCES DonXuatHang(MaDonXuat),
    MaSanPham NVARCHAR(100) FOREIGN KEY REFERENCES SanPham(MaSanPham),
    SoLuong float,
    DonGia float
);
GO



-----------------------------
select* from KhoHang;
select* from DonNhapHang;
select* from DonXuatHang;
select* from SanPham;
select* from ChiTietTonKho;
select* from ChiTietDonXuatHang;
select* from ChiTietDonNhapHang;
-------------------------------
	TRUNCATE TABLE DonNhapHang;
--------------------------------------
delete from DonXuatHang where MaDonXuat='DX1'

--------TẠO DỮ LIỆU MẪU--------
--KhoHang
INSERT INTO KhoHang (MaKhoHang, TenKhoHang, DiaChi) VALUES ('SAIGON', N'Kho Chính Sài Gòn', N'123 Đường Nguyễn Huệ, Quận 1, TP.HCM');
INSERT INTO KhoHang (MaKhoHang, TenKhoHang, DiaChi) VALUES ('HANOI', N'Kho Miền Bắc Hà Nội', N'456 Đường Láng, Đống Đa, Hà Nội');
INSERT INTO KhoHang (MaKhoHang, TenKhoHang, DiaChi) VALUES ('DANANG', N'Kho Đà Nẵng', N'789 Đường 2/9, Hải Châu, Đà Nẵng');
INSERT INTO KhoHang (MaKhoHang, TenKhoHang, DiaChi) VALUES ('CANTHO', N'Kho Cần Thơ', N'101 Đường 3/2, Ninh Kiều, Cần Thơ');
INSERT INTO KhoHang (MaKhoHang, TenKhoHang, DiaChi) VALUES ('HAIPHONG', N'Kho Hải Phòng', N'202 Đường Lạch Tray, Ngô Quyền, Hải Phòng');
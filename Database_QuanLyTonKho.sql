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



-------Tạo dữ liệu mẫu------
--KhoHang
insert into KhoHang values ('Kho HCM','Kho 1',N'164 Ngô Gia Tự, Phường 16, QUận 8, Tp.HCM');
insert into KhoHang values ('Kho Ha Noi','Kho 2',N'169 Ngô Gia Tự, Phường 16, QUận 8, Tp.HCM');
insert into KhoHang values ('Kho Da Nang','Kho 3',N'169 Ngô Gia Tự, Quận Cầu Giấy, Hà Nội');


-----------------------------
select* from KhoHang;
select* from DonNhapHang;
select* from DonXuatHang;
select* from SanPham;
select* from ChiTietTonKho;
select* from ChiTietDonXuatHang;

--------------------------------------
delete from DonXuatHang where MaDonXuat='DX1'
	SELECT MaKhoHang,MaSanPham,TenSanPham,SoLuongTonKho FROM ChiTietTonKho WHERE MaKhoHang = 'Kho HCM';
	TRUNCATE TABLE KhoHang;
select* from ChiTietDonNhapHang;
select* from ChiTietDonXuatHang;
---------------------
SELECT MaKhoHang,DonNhapHang.MaDonNhap,TenSanPham,SanPham.MaSanPham,TenLoaiSanPham,DonViTinh,ChiTiet,DonGia,SoLuong,NgayTao

FROM SanPham Join ChiTietDonNhapHang on ChiTietDonNhapHang.MaSanPham=SanPham.MaSanPham Join DonNhapHang on DonNhapHang.MaDonNhap=ChiTietDonNhapHang.MaDonNhap
where MaKhoHang = 'Kho HCM'
order by DonNhapHang.MaKhoHang


---------------------
SELECT MaKhoHang,TenSanPham,SanPham.MaSanPham,TenLoaiSanPham,DonViTinh,ChiTiet,SoLuong

FROM SanPham Join ChiTietDonNhapHang on ChiTietDonNhapHang.MaSanPham=SanPham.MaSanPham Join DonNhapHang on DonNhapHang.MaDonNhap=ChiTietDonNhapHang.MaDonNhap
where MaKhoHang = 'Kho HCM'
order by DonNhapHang.MaKhoHang

---------------------------------
SELECT 
    DonNhapHang.MaKhoHang,
    SanPham.MaSanPham,
    TenSanPham,
    TenLoaiSanPham,
    DonViTinh,
    ChiTiet,
    SUM(SoLuong) AS TongSoLuong
FROM 
    SanPham
    JOIN ChiTietDonNhapHang ON ChiTietDonNhapHang.MaSanPham = SanPham.MaSanPham
    JOIN DonNhapHang ON DonNhapHang.MaDonNhap = ChiTietDonNhapHang.MaDonNhap
WHERE 
    DonNhapHang.MaKhoHang = 'HCM'
GROUP BY 
    DonNhapHang.MaKhoHang,
    SanPham.MaSanPham,
    TenSanPham,
    TenLoaiSanPham,
    DonViTinh,
    ChiTiet
ORDER BY 
    DonNhapHang.MaKhoHang;


	-------------------------
	SELECT
    ChiTietTonKho.MaKhoHang,
    DonNhapHang.MaDonNhap,
    SanPham.TenSanPham,
    SanPham.MaSanPham,
    SanPham.TenLoaiSanPham,
    SanPham.DonViTinh,
   SanPham.ChiTiet,
    ChiTietDonNhapHang.DonGia,
    ChiTietDonNhapHang.SoLuong, -- Lưu ý: SoLuong này là từ ChiTietDonNhapHang, không phải SoLuongTonKho
    DonNhapHang.NgayTao -- Lấy ngày tạo của đơn nhập hàng làm ngày nhập
FROM
    ChiTietTonKho
JOIN
    SanPham ON  ChiTietTonKho.MaSanPham = SanPham.MaSanPham
JOIN
    ChiTietDonNhapHang ON ChiTietTonKho.MaSanPham = ChiTietDonNhapHang.MaSanPham
JOIN
    DonNhapHang ON ChiTietDonNhapHang.MaDonNhap = DonNhapHang.MaDonNhap
WHERE
    ChiTietTonKho.MaKhoHang = 'Kho HCM';


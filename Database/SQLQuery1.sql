create database NhaSach
create table Sach (
ID VARCHAR(255) Primary key,
TenSach nvarchar(255),
GiaBan float,
NamXuatBan int
);
CREATE TABLE KhachHang (
    ID VARCHAR(255) PRIMARY KEY,
    HoVaTen NVARCHAR(255),
    NgaySinh DATE,
    DiaChi NVARCHAR(255)
);
select * from Sach;

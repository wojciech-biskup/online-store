--Sample data

insert into CPU values (default, 10, 2.9, 6, 'Intel Core i5-10400F', 179.99, '1200');
insert into CPU values (default, 10, 3.8, 8, 'Intel Core i7-10700K', 449.99, '1200');
insert into CPU values (default, 10, 3.6, 6, 'AMD Ryzen 5 3600', 239.99, 'AM4');

insert into GRAPHICS_CARD values (default, 10, 1710, 245, 'MSI GeForce GTX 1650', 189.99, 4);
insert into GRAPHICS_CARD values (default, 10, 1860, 280, 'Gigabyte GeForce GTX 1660', 259.99, 6);
insert into GRAPHICS_CARD values (default, 10, 1860, 247, 'MSI GeForce GTX 1660', 299.99, 6);

insert into HDD_DRIVE values (default, 10, 4, 'Toshiba 4 TB 3.5" SATA III X300', 159.99, 7200, 3.5);
insert into HDD_DRIVE values (default, 10, 1, 'Toshiba P300 1 TB 3.5" SATA III', 44.99, 7200, 3.5);
insert into HDD_DRIVE values (default, 10, 1, 'Western Digital Caviar Blue 1 TB 3.5" SATA III', 49.99, 7200, 3.5);

insert into MOTHERBOARD values (default, 3, 'AMD B450', 4, 'Gigabyte B450 AORUS ELITE', 99.99, 'AM4', 'ATX');
insert into MOTHERBOARD values (default, 3, 'AMD X570', 4, 'Gigabyte X570 GAMING X', 199.99, 'AM4', 'ATX');
insert into MOTHERBOARD values (default, 3, 'AMD A320', 2, 'Gigabyte GA-A320M-S2H', 59.99, 'AM4', 'Micro ATX');

insert into POWER_SUPPLY values (default, 3, '80 Plus Bronze', 'SilentiumPC Vero L3 500W', 49.99, 500);
insert into POWER_SUPPLY values (default, 3, '80 Plus Bronze', 'be quiet! SYSTEM POWER 9 500W', 59.99, 500);
insert into POWER_SUPPLY values (default, 3, '80 Plus Gold', 'SilentiumPC Supremo L2 V2 550W', 69.99, 550);

insert into RAM_STICK values (default, 3, 16, 3200, 'ADATA Gammix D10, DDR4, 16 GB, 3200MHz, CL16', 69.99, 'DDR4');
insert into RAM_STICK values (default, 3, 16, 3600, 'GoodRam IRDM, DDR4, 16 GB, 3600MHz, CL17', 99.99, 'DDR4');
insert into RAM_STICK values (default, 3, 16, 3200, 'Corsair Vengeance RGB PRO, DDR4, 16 GB, 3200MHz, CL16', 89.99, 'DDR4');
create database ecommerce;
use ecommerce;

create table cadastro_produtos (
	id int primary key auto_increment not null,
    produto varchar (255) not null,
    tamanho enum ('P', 'M', 'G'),
    preco double (6,2),
    data datetime default current_timestamp);
    
    #inserindo dados
    insert into cadastro_produtos values
    (default, "Calça", 'M', 550.20, default);
    
     insert into cadastro_produtos values
    (default, "Camisa", 'P', 490.30, default);
    
     insert into cadastro_produtos values
    (default, "Touca", 'M', 500.00, default);
    
     insert into cadastro_produtos values
    (default, "Vestido", 'G', 250.00, default);
    
     insert into cadastro_produtos values
    (default, "Baby look", 'G', 360.50, default);
    
    insert into cadastro_produtos values
    (default, "Calça", 'G', 580.20, default);
    
	insert into cadastro_produtos values
    (default, "Camisa", 'G', 510.20, default);
    
	select *from cadastro_produtos;
   
	select *from cadastro_produtos where preco >500;
    select *from cadastro_produtos where preco <500;
    
    update cadastro_produtos
	set preco = 300.00
	where produto = "Vestido";
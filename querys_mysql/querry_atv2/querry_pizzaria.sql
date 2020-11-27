create database pizzaria;
use pizzaria;

create table tb_categoria (
	id_categoria int not null auto_increment primary key,
    nome_categoria varchar (255));
    
create table tb_pizza (
	id_pizza int not null auto_increment primary key,
    nome_pizza varchar (255),
    tamanho enum ('G', 'M', 'P'),
    borda boolean,
    preco double (4,2),
    id_categoria integer,
    constraint fk_pizza foreign key (id_categoria) references tb_categoria (id_categoria));
    
	insert into tb_categoria values
	(1, "Doce");
    insert into tb_categoria values
	(2, "Salgada");
    insert into tb_categoria values
	(3, "Vegana");
    insert into tb_categoria values
	(4, "Meio a meio");
    insert into tb_categoria values
	(5, "Brotinho");
    
    insert into tb_pizza values
	(1, "Marguerita", 'G', false, 39.90, 2);
    insert into tb_pizza values
	(2, "Mussarela", 'M', false, 35.90, 2);
    insert into tb_pizza values
	(3, "Brigadeiro", 'G', true, 49.90, 1);
    insert into tb_pizza values
	(4, "Cababresa", 'G', true, 45.90, 5);
    insert into tb_pizza values
	(5, "Algas", 'P', false, 34.90, 3);
    insert into tb_pizza values
	(6, "Portuguesa/Frango", 'G', true, 50.90, 4);
    insert into tb_pizza values
	(7, "Romeu e julieta", 'M', false, 47.30, 1);
    insert into tb_pizza values
	(8, "Atum", 'P', true, 39.90, 5);
    
    select *from tb_categoria;
    select *from tb_pizza;
    
    select *from tb_pizza
    where preco > 45.00;
    
    select *from tb_pizza
    where id_categoria = 2;
    
    select * from tb_pizza
	inner join tb_categoria
	on tb_pizza.id_pizza = tb_categoria.id_categoria;
    
    
    
    

    
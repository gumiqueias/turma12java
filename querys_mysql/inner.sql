create database aula_join;
use aula_join;

CREATE TABLE dados_clientes (	
	cliente_id1 INT(11) NOT NULL,	
    cliente_endereco TEXT,	PRIMARY KEY ( cliente_id1 ) );
    
INSERT INTO dados_clientes  (cliente_id1, cliente_endereco) VALUES
	(1, 'Rua Faria lima, Centro, São Paulo'),
    (2, 'Rua Osvaldo Cruz,Campinas, São Paulo'),
    (3, 'Rua Rosana, Sinara, Nova Esperança'),
    (4, 'Av. Bias Fortes, Centro, Brasília'),
    (5, 'Beatles, Santa Cruz, Rio de Janeiro'),
    (6, 'Av. Esquerda, Vila Pinheiro, New York');

create table clientes (
	cliente_id0 int primary key auto_increment, 
    nome varchar(100));
    
insert into clientes values	(1, "João Marcio"),	(2, "Juliana"),	(3, "João Marcio"),	(4, "Gabriela"),    (6, "Fabio"),    (7, "Juliana");   

select * from dados_clientes;

#inner join
select * from clientes
left join dados_clientes
on clientes.cliente_id0 = dados_clientes.cliente_id1;
create database rh;
use rh;

drop table funcionarios;

create table funcionarios (
	id int primary key auto_increment not null,
    nome varchar (255) not null,
    setor varchar (255),
    salario double (6,2),
    sexo enum ('M','F'));
    
    #inserindo dados
    insert into funcionarios values
    (default, "Gustavo Santos", "T.I.", 1500, 'M');
    
     insert into funcionarios values
    (default, "Amanda Lopes", "RH.", 2500, 'F');
    
     insert into funcionarios values
    (default, "Lucas Bargieri", "Contabilidade", 2100, 'M');
    
     insert into funcionarios values
    (default, "Thamires Reis", "Administração.", 1800, 'F');
    
     insert into funcionarios values
    (default, "Mariana Silva", "Enfermagem.", 1900, 'F');
    
    #selecionando 
    select *from funcionarios where salario >= 2000;
    select *from funcionarios where salario < 2000;
    
    select *from funcionarios;
    
    #atualizando dados
	update funcionarios
	set nome = "Beatriz Rezende"
	where id = 2;
    
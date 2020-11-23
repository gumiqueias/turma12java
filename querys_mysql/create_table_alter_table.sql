create table funcionarios (
	id int not null auto_increment primary key, #constantes - não pode ser nulo, a chave primaria se relaciona com outras tabelas.
    nome varchar (30) NOT NULL,
    nascimento date,
    sexo enum ('M', 'F'),
    peso decimal (5,2),
    altura decimal (3,2),
    dia_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP, #pega a hora que o usuário inserir o dado e salva 
    nacionalidade varchar (20) DEFAULT 'Brasil' #default significa padrao
    );
    
    describe funcionarios;
    
    alter table funcionarios modify column nome char (255);
    
    alter table funcionarios add column historico char (255) after nome;

    
    
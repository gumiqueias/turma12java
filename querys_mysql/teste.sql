use projetointegrador;

select * from tb_produto;

Insert into tb_produto values 
(DEFAULT,'Teste para saber se funcionou', 25,'https://i.imgur.com/V8Nmsiq.jpg','Daniel mó Breck',35,'Grande',1);

Insert into tb_categoria values 
(DEFAULT,'Humanos','Carne e osso');	

delete from tb_produto
where id_produto = '4';
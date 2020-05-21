# Microsservicos-Java
Simulador de Investimento em Ações utilizando Microsservicos

Desenvolva uma aplicação que simule compra e venda de ações na bolsa de valores, esta aplicação deve conter:

- Endpoint 1:
	- GET - <hostname_ibm_cloud>/cotacao?acao=<nome_acao>
- Endpoint 2:
	- GET - <hostname_ibm_cloud>/carteira

Cada cliente comeca com 100k em dinheiro. Cada compra de acoes subtrai deste valor, adiciona a acao na carteira de acoes e adiciona o valor total desta compra na variavel total_quotes.

- Endpoint 3:
	- POST - <hostname_ibm_cloud>/compra
Envia qual é a acao que deseja ser comprar, a aplicação busca o valor desta cotação acessando um microserviço externo, multiplica o preço pela quantidade desejada, salva na carteira de ações em uma base de dados H2 e mostra o valor total da operacao.

- Endpoint 4:
	- POST - <hostname_ibm_cloud>/venda
Busca o nome da ação pelo id na base de dados H2, busca a cotação atual desta ação, subtrai a quantidade de ações desta base H2  e mostra o valor total da operacao.

- Significado das variaveis:
	- price : Valor atual da ação (Double)
	- symbol: Nome de cada ação (String)
	- qtd: Quantidade de ações (Integer)
	- v_total: Quantidade de ações multiplicado pelo valor ATUAL de cada ação (Double)
 	- id: id de cada ação na carteira (Integer)
 	- total_money: Quantia em dinheiro na conta (Double)
 	- total_quotes: Soma dos valores das ações que a conta possui (Double)
 	- buy_price: Preço da ação quando a mesma foi comprada (Double)
 	- actual_price: Valor atual da ação (Double)


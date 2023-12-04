# ListaCAA02

5. Analise os algoritmos abaixo de maneira mais justa possível. Definir o custo dos laços em termos de n. 
1- 
1 sum = 0; 
2 for ( int i =0; i < n ; i ++) { 
3 for ( int j =1; j <= n ; j ++) { 
4 sum ++; 
5 } 
6 } 
2- 
1 sum = 0; 
2 for ( int i =1; i < n ; i *=2) { 
3 for ( int j =1; j <= n ; j ++) { 
4 sum ++; 
5 } 
6 } 
3- 
1 sum = 0; 
2 for ( int i =0; i < n ; i *=2) { 
3 for ( int j =1; j <= n ; j += i ) { 
4 sum ++; 
5 } 
6 } 

RESPOSTA:
Algoritmo 1: O algoritmo 1 tem dois loops aninhados. O primeiro loop externo executa n vezes, pois o intervalo de iteração é 0 <= i < n. O segundo loop interno executa n vezes, pois o intervalo de iteração é 1 <= j <= n. Portanto, o custo total do algoritmo é n * n = n^2.
Algoritmo 2: O algoritmo 2 também tem dois loops aninhados. O primeiro loop externo executa log_2(n) vezes, pois o intervalo de iteração é 1 <= i < n e i *= 2. O segundo loop interno executa n vezes, pois o intervalo de iteração é 1 <= j <= n. Portanto, o custo total do algoritmo é log_2(n) * n = n \cdot log_2(n).
Algoritmo 3: O algoritmo 3 também tem dois loops aninhados. O primeiro loop externo executa log_2(n) vezes, pois o intervalo de iteração é 0 <= i < n e i *= 2. O segundo loop interno executa n / i vezes, pois o intervalo de iteração é 1 <= j <= n e j += i. Portanto, o custo total do algoritmo é log_2(n) \cdot \frac{n}{i} = \frac{n^2}{i} = \frac{n^2}{log_2(n)}.


8. (Algoritmos não-recursivos) Determine a função de complexidade (no pior e melhor caso e no caso médio), das funções implementadas em Python, apresentadas abaixo, fazendo as considerações pertinentes. 
1 # primeiro 
2 def bubble_sort (A , n ) : 
3 for j in range ( n ) : 
4 for i in range ( n - 1) : 
5 if A [ i ] > A [ i + 1]: 
6 aux = A [ i ] 
7 A [ i ] = A [ i + 1] 
8 A [ i + 1] = aux 
1 # segundo 
2 def bubble_sort2 (A , n ) : 
3 troca = True 
4 while troca : 
5 troca = False 
6 for i in range ( n - 1) : 
7 if A [ i ] > A [ i + 1]: 
8 aux = A [ i ] 
9 A [ i ] = A [ i + 1] 
10 A [ i + 1] = aux 
11 troca = True 
1 def AlgumaCoisa ( n ) : 
2 x = 0 
3 for i in range (1 , n ): 
4 for j in range ( i + 1 , n + 1) : 
5 for k in range (1 , j + 1) : 
6 x = x + 1 
1 def AlgumaCoisa2 ( n ) : 
2 x = 0 
3 for i in range (1 , n + 1) : 
4 for j in range ( i + 1 , n ) : 
5 for k in range (1 , j + 1) : 
6 x = x + 1 

RESPOSTA:
AlgumaCoisa:
Esta função tem complexidade O(n³) no pior caso.
Pior Caso: O(n³) - Três loops aninhados.
Melhor Caso: O(n) - Se n=1, o loop externo não executa.
Caso Médio: O(n³) - Média entre o pior e melhor caso.

AlgumaCoisa2:
Esta função tem complexidade O(n³) no pior caso.
Pior Caso: O(n³) - Três loops aninhados.
Melhor Caso: O(n²) - Se o loop intermediário não executa.
Caso Médio: O(n³) - Média entre o pior e melhor caso.

9. (Algoritmos recursivos) Determine a função de complexidade, das funções recursivas apresentadas
abaixo, fazendo as considerações que considerar pertinente.
1 # Primeira
2 def Pesquisa1 (A , n ) :
3 if n > 1:
4 InspecioneNElementos = n * n * n # custo n^3
5 Pesquisa1 (A , n // 3)
6 # Segunda
7 def Pesquisa2 (A , n ) :
8 if n <= 1:
9 return
10 else :
11 # obtenha o maior elemento entre os elementos
12 # de alguma forma isso permite descartar 2/5 dos elementos e fazer
uma chamada recursiva no resto
13 Pesquisa2 (A , 3 * n // 5)
14 # Terceira
15 def Pesquisa3 (A , n ) :
16 if n <= 1:
17 return
18 else :
19 # ordena os elementos
20 # de alguma forma isso permite descartar 1/3 dos elementos e fazer
uma chamada recursiva no resto
21 Pesquisa3 (A , 2 * n // 3)
22 # Magica !!
23 class Item :
24 def __init__ ( self , Chave ) :
25 self . Chave = Chave
26
27 def Enigma2 (A , m , n , i , j ) :
28 x = A [( i + j ) // 2]
29 while True :
30 while x . Chave > A [ i ]. Chave :
31 i += 1
32 while x . Chave < A [ j ]. Chave :
33 j -= 1
34 if i <= j :
35 A [ i ] , A [ j] = A [ j ] , A [ i ]
36 i += 1
37 j -= 1
38 if i > j :
39 break
40
41 def Enigma1 (A , m , n ) :
42 i , j = 0 , 0
43 Enigma2 (A , m , n , i , j )
44 if m < j :
45 Enigma1 (A , m , j )
46 if i < n :
47 Enigma1 (A , i , n )

RESPOSTA: A função Pesquisa1 é uma função recursiva que divide o tamanho do problema por 3 em cada chamada. A complexidade dessa função pode ser expressa como uma série geométrica, onde o tamanho do problema é reduzido para 1 em log base 3 de n chamadas recursivas. A complexidade será da ordem de O(n^3 * log n), pois em cada chamada a complexidade é n^3, e há log n chamadas recursivas.
A função Pesquisa2 divide o tamanho do problema por 5/3 em cada chamada recursiva. Assim como no caso anterior, a complexidade pode ser expressa como uma série geométrica, resultando em uma complexidade de O(n^log_(5/3) n).
A função Pesquisa3 divide o tamanho do problema por 3/2 em cada chamada recursiva. Portanto, a complexidade pode ser expressa como O(n^log_(3/2) n).

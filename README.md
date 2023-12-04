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

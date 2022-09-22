/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleção_de_mapas;


import java.util.Map;
import static javafx.scene.text.Font.font;

/**
 *
 * @author Jaqueline Oliveira
 */
public class HashMap {
    
    //Criação de um HashMap:
    
     <font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <Integer, String> mapHttpErrors = new HashMap <> ();</font></font><font></font>;
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (200, "OK");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (303, "Consulte outro");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (404, "Não encontrado");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (500, "Erro interno do servidor");</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println (mapHttpErrors);</font></font>

  // Isso mapeia os códigos de status HTTP para suas descrições. Saída:
<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{404 = Não encontrado, 500 = Erro interno do servidor, 200 = OK, 303 = Ver outro}</font></font>
 

//Como você pode ver na saída, um HashMap não impõe nenhuma ordem em seus elementos de valor-chave.
//Você pode criar um novo mapa que copia elementos de um mapa existente. Por exemplo:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <Integer, String> mapErrors = new HashMap <> (mapHttpErrors);</font></font>

O mapa mapErrors é criado com os elementos iniciais copiados do mapa mapHttpErrors .
 
//Criando um LinkedHashMap:
//O código a seguir cria um LinkedHashMap que mapeia números de telefone com nomes de contato:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <String, String> mapContacts = new LinkedHashMap <> ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapContacts.put ("0169238175", "Tom");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapContacts.put ("0904891321", "Peter");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapContacts.put ("0945678912", "Mary");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapContacts.put ("0981127421", "John");</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println (mapContacts);</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{0169238175 = Tom, 0904891321 = Pedro, 0945678912 = Maria, 0981127421 = João}</font></font>

//Criando um TreeMap:
//O código a seguir cria um TreeMap que mapeia extensões de arquivo para linguagens de programação:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <String, String> mapLang = new TreeMap <> ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapLang.put (". c", "C");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapLang.put (". java", "Java");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapLang.put (". pl", "Perl");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapLang.put (". cs", ​​"C #");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapLang.put (". php", "PHP");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapLang.put (". cpp", "C ++");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapLang.put (". xml", "XML");</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println (mapLang);</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{.c = C, .cpp = C ++, .cs = C #, .java = Java, .php = PHP, .pl = Perl, .xml = XML}</font></font>
//Como você pode ver, o TreeMap classifica suas chaves pela ordem natural , que é a ordem alfabética neste caso.
 
// Execução de operações básicas em um mapa
//As operações básicas de um Mapa são associação ( colocar ), pesquisa ( obter ), verificação ( contémKey e contémValue ), modificação ( remover e substituir ) e cardinalidade ( tamanho e isEmpty ).
 
//Associando um valor a uma chave:
//O método put (K, V) associa o valor especificado V com a chave especificada K. Se o mapa já contém um mapeamento para a chave, o valor antigo é substituído pelo valor especificado:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <Integer, String> mapHttpErrors = new HashMap <> ();</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (400, "Solicitação inválida");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (304, "Não modificado");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (200, "OK");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (301, "Movido permanentemente");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.put (500, "Erro interno do servidor");</font></font>
 
//Obter um valor associado a uma chave especificada:
//O método get (Object key) retorna o valor associado à chave especificada ou retorna null se o mapa não contém mapeamento para a chave. Dado o mapa no exemplo anterior:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">String status301 = mapHttpErrors.get (301);</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println ("301:" + status301);</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">301 mudou-se permanentemente</font></font>
 
//Verificando se o mapa contém uma chave especificada:
//O método containsKey (Object key) retorna true se o mapa contém um mapeamento para a chave especificada. Por exemplo:


<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">if (mapHttpErrors.containsKey ("200")) {</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    System.out.println ("Status HTTP 200");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
}</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Encontrado: status Http 200</font></font>
 
//Verificar se o mapa contém um valor especificado:
//O método containsValue (Object value) retorna true se o mapa contém uma ou mais chaves associadas ao valor especificado. Por exemplo:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">if (mapHttpErrors.containsValue ("OK")) {</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    System.out.println ("Status encontrado OK");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
}</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Status encontrado OK</font></font>
 
//Remover um mapeamento do mapa:
//O método remove (Object key) remove o mapeamento de uma chave do mapa se estiver presente (nos preocupamos apenas com a chave, e o valor não importa). Este método retorna o valor ao qual o mapa associou anteriormente a chave, ou null se o mapa não contém mapeamento para a chave. Aqui está um exemplo:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">String removedValue = mapHttpErrors.remove (500);</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
if (removedValue! = null) {</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    System.out.println ("Valor removido:" + removedValue);</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
}</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Valor removido: Erro interno do servidor</font></font>
//Da mesma forma, o método remove (chave do objeto, valor do objeto) remove o mapeamento de uma chave especificada e do valor especificado e retorna verdadeiro se o valor foi removido. Este método é útil caso realmente nos importemos com a chave e o valor a serem removidos.
//Recomendo que você leia este conhecido livro de coleções Java para aprender mais sobre a estrutura de coleções Java.
 
//Substituindo um valor associado a uma chave especificada:
//O método replace (chave K, valor V) substitui a entrada da chave especificada apenas se ela estiver mapeando para algum valor. Este método retorna o valor anterior associado à chave especificada. Aqui está um exemplo:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">System.out.println ("Map before:" + mapHttpErrors);</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapHttpErrors.replace (304, "Sem alterações");</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println ("Mapear depois:" + mapHttpErrors);</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Mapa anterior: {400 = Solicitação inválida, 304 = Não modificado, 200 = OK, 301 = Movido permanentemente}</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
//Mapa depois de: {400 = Solicitação inválida, 304 = Sem alterações, 200 = OK, 301 = Movido permanentemente}</font></font>
//Da mesma forma, o método replace (chave K, V oldValue, V newValue) substitui a entrada da chave especificada apenas se ela estiver mapeando atualmente para o valor especificado. Este método retorna verdadeiro se o valor foi substituído. Útil no caso de desejarmos substituir exatamente um mapeamento de valor-chave.
 
//Obtendo o tamanho do mapa:
//O método size () retorna o número de mapeamentos de valores-chave neste mapa. Por exemplo:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">int size = mapHttpErrors.size ();</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Número do código de status HTTP: 5</font></font>
 
//Verificar se o mapa está vazio:
//O método isEmpty () retorna verdadeiro se o mapa não contém mapeamentos de valores-chave. Por exemplo:


<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">if (mapHttpErrors.isEmpty ()) {</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    System.out.println ("Sem erro");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
} outro {</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    System.out.println ("Possui erros de HTTP");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
}</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Têm erros HTTP</font></font>
 
// Iterando sobre um mapa (usando visualizações de coleção)
//Como um mapa não é uma coleção verdadeira, não existe um método direto para iterar em um mapa. Em vez disso, podemos iterar em um mapa usando suas visualizações de coleção. A implementação de qualquer mapa deve fornecer os três métodos de visualização da coleção a seguir:
//keySet () : retorna uma visualização Set das chaves contidas no mapa. Portanto, podemos iterar sobre as chaves do mapa, conforme mostrado no exemplo a seguir:


<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <String, String> mapCountryCodes = new HashMap <> ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapCountryCodes.put ("1", "EUA");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapCountryCodes.put ("44", "Reino Unido");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapCountryCodes.put ("33", "França");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
mapCountryCodes.put ("81", "Japão");</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
Defina <String> setCodes = mapCountryCodes.keySet ();</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
Iterator <String> iterator = setCodes.iterator ();</font></font><font></font>
<font></font>
while (iterator.hasNext()) {<font></font>
    String code = iterator.next();<font></font>
    String country = mapCountryCodes.get(code);<font></font>
<font></font>
    System.out.println(code + " => " + country);<font></font>
}
 
//Saída:

=> United Kingdom<font></font>
=> France<font></font>
=> USA<font></font>
 => Japan
 
//values ​​() : retorna uma coleção de valores contidos no mapa. Assim, podemos iterar sobre os valores do mapa como este:

         
Collection<String> countries = mapCountryCodes.values();<font></font>
<font></font>
for (String country : countries) {<font></font>
    System.out.println(country);<font></font>
}

//Saída:

United Kingdom<font></font>
France<font></font>
USA<font></font>
Japan
 
entrySet () : retorna uma visualização Set dos mapeamentos contidos neste mapa. Portanto, podemos iterar nos mapeamentos no mapa assim:

Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();<font></font>
<font></font>
for (Map.Entry<String, String> entry : entries) {<font></font>
    String code = entry.getKey();<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    String country = entry.getValue ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    System.out.println (código + "=>" + país);</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
}</font></font>
//Saída:


<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">44 => Reino Unido</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
=> França</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
=> EUA</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
 => Japão</font></font>
Desde Java 8 com expressões Lambda e a instrução forEach () , iterar sobre um mapa é tão fácil quanto:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">mapCountryCodes.forEach (</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    (código, país) -> System.out.println (código + "=>" + país));</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">44 => Reino Unido</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
 => França</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
 => EUA</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
=> Japão</font></font>
Para obter mais informações sobre os diferentes métodos de iteração de coleção, leia este artigo: Os 4 métodos para iterar coleções em Java .
 
// Execução de operações em massa com mapas
Existem duas operações em massa com mapas: clear () e putAll () .
O método clear () remove todos os mapeamentos do mapa. O mapa ficará vazio após o retorno desse método. Por exemplo:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">mapHttpErrors.clear ();</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println ("O mapa está vazio?" + MapHttpErrors.isEmpty ());</font></font>
//Saída:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">O mapa está vazio? </font><font style="vertical-align: inherit;">verdadeiro</font></font>
O método putAll (Map <K, V> m) copia todos os mapeamentos do mapa especificado para este mapa. Aqui está um exemplo:

      
<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <Integer, String> countryCodesEU = new HashMap <> ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
countryCodesEU.put (44, "Reino Unido");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
countryCodesEU.put (33, "França");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
countryCodesEU.put (49, "Alemanha");</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
Map <Integer, String> countryCodesWorld = new HashMap <> ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
countryCodesWorld.put (1, "Estados Unidos");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
countryCodesWorld.put (86, "China");</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
countryCodesWorld.put (82, "Coreia do Sul");</font></font><font></font>
<font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println ("Antes:" + countryCodesWorld);</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
countryCodesWorld.putAll (countryCodesEU);</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
System.out.println ("Depois:" + countryCodesWorld);</font></font>
Saída:


<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Antes: {1 = Estados Unidos, 82 = Coreia do Sul, 86 = China}</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
Depois: {1 = Estados Unidos, 33 = França, 49 = Alemanha, 82 = Coreia do Sul, 86 = China, 44 = Reino Unido}</font></font>
 
 Mapas simultâneos
Ao contrário do legado tabela de hash  que é sincronizado, o HashMap , TreeMap e LinkedHashMap não estiverem sincronizados. Se thread-safe for prioridade, considere o uso de ConcurrentHashMap no lugar de HashMap . Ou podemos usar o método utilitário Collections.synchronizedMap () que retorna um mapa sincronizado (thread-safe) apoiado pelo mapa especificado. Por exemplo:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Map <Integer, String> map = Collections.synchronizedMap (new HashMap <> ());</font></font>
E lembre-se de que temos que sincronizar manualmente o mapa ao iterar sobre qualquer uma de suas visualizações de coleção:

<font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Defina <Integer> keySet = map.keySet ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
sincronizado (mapa) {</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    Iterator <Integer> iterator = keySet.iterator ();</font></font><font></font>
<font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    while (iterator.hasNext ()) {</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
        Chave inteira = iterator.next ();</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
        Valor da string = map.get (chave);</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
    }</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
}</font></font>
Se você usar um tipo de SortedMap , por exemplo, TreeMap , considere usar o método mais específico Collections.synchronizedSortedMap () .

}

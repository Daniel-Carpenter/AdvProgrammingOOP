# Collections (Ch. 15)

## 15.1 Enhanced For Loop using ArrayList

### Generally

```java
for (type var1 : list) {
}
```

### Example

Code:

```java
ArrayList<String> teamRoster = new ArrayList<String>();

// Adding player names
teamRoster.add("Mike");
teamRoster.add("Scottie");
teamRoster.add("Toni");

System.out.println("Current roster:");

for (String playerName : teamRoster) {
   System.out.println(playerName);
```

Output:

```txt
Current roster:
Mike
Toni
Scottie

```

## 15.2 `LinkedList`s

* Same funtionality as an `ArrayList<T>`, but has `hasNext()` and `hasPrevious` functionality for easy `while` loops.

```java
LinkedList<String> authorsList = new LinkedList<String>();  
String authorName;

// Create LinkedList
    ListIterator<String> listIterator;

// Add Elements
    authorsList.add("Gamow");  
    authorsList.add("Greene");  
    authorsList.add("Penrose");

// Create List Iterator
    listIterator = authorsList.listIterator();

// Has Next Example
    while (listIterator.hasNext()) {
    authorName = listIterator.next();
    System.out.println(authorName);  
    }
```

## 15.3 Map: `HashMap`

### Declaration

```java
// Generally
    HashMap<inputType, outputType> hashMap = new HashMap<inputType, outputType>()

// -----------------------------------------------------------------

// Practically - Declation
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>()
```

### Adding and getting elements (based on first type value)

```java
// Add Elements
    hashMap.put("string1", 1234);
    hashMap.put("string2", 5678);

// Retrieve based on First Type (String Value)
    System.out.println(hashMap.get(string1));
```

Output:

```txt
1234
```

### Common `HashMap` Methods

```java
put(key, value);
putIfAbsent(key, value);    // if absent,then add
containsKey(key);           // first type
containsValue(value);       // second type
clear();                    // removes everything
keySet();                   // returns all keys in list
values();                   // returns all values
```

## 15.4 Set: `HashSet`


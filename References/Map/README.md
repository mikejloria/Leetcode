# Java Map

## The Map Interface

A `Map` is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value. The `Map` interface includes methods for basic operations (such as `put`, `get`, `remove`, `containsKey`, `containsValue`, `size`, and `empty`), bulk operations (such as `putAll` and `clear`), and collection views (such as `keySet`, `entrySet`, and `values`).

The Java platform contains three general purpose `Map` implementations: `HashMap`, `TreeMap`, and `LinkedHashMap`

The remainder of this page discusses the `Map` interface in detail. But first, here are some more examples of collecting to `Map` using aggregate operations. Modeling real world objects is a comon task in OOP, so it is reasonable to think that some programs might, for example, group employees by department.

```java
// group employees by department
Map<Department, List<Employee>> byDept = employees.stream().collect(Collectors.groupBy(Employee::getDepartment));
```

Or compute the sum of all salaries by department:

```java
// compute sum of salaries by department
Map<Department, Integer> totalByDept = employees.stream().collect(Collectors.groupBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));
```

Or perhaps students by passing or failing grades:

```java
// partition students into passing and failing
Map<Boolean, List<Student>> passingFailing = students.stream().collect(Collectors.partitionBy(s -> s.getGrade() >= PASS_THRESHOLD));
```

You could also group people by city:

```java
// classify Person objects by city
Map<String, List<Person>> peopleByCity = personStream.collect(Collectors.groupBy(Person::getCity));
```

Or even cascade two collectors to classify people by state and city:

```java
// cascade collectors
Map<String, Map<String, List<Person>>> peopleByStateAndCity = personStream.collect(Collectors.groupBy(Person::getState,Collectors.groupinBy(Person::getCity)))
```

For more in depth coverage of lambda expressions and aggregate operations see [Aggregate Operations](https://docs.oracle.com/javase/tutorial/collections/streams/index.html)

## Map Interfact Basic Operations

The basic operations of Map are (`put`,`get`,`containsKey`,`containsValue`,`size`, and `isEmpty`)

- `put(K key, V value)` : associates the specified value with the specified key
- `get(Object key)` : returns the value to which the specified key is mapped or null if there is no mapping to the key
- `containsKey(Object key)` : returns true if this map contains a mapping for the specified key
- `containsValue(Object value)` : returns true if this map maps one or more keys to the specified value
- `size()` : returns the number of key-value mappings in this map
- `isEmpty()` : returns true if this map contains no key-value mappings

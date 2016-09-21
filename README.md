# What is it ?

This spring boot application contains 2 APIs to test how input can be mapped to DTO by Spring.

## test of RequestBody params to DTO:

```
curl -i -X POST \
   -H "Content-Type:application/json" \
   -d \
'{"a":"azaz"}' \
 'http://localhost:8500/api/test'
```

returns:

```js
{"a":"azaz"}
```

## test of RequestMapping params to DTO:

```
curl -i -X GET \
   -H "Content-Type:application/json" \
 'http://localhost:8500/api/test?a=azaz'
```

returns:

```js
{"a":"azaz"}
```

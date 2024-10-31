#### Session

- Http protokolü stateless / durumsuz bir protokoldür.
- client/browser server a istekte bulunur. server isteği karşılar cevap döner sonra bağlantı kapanır.
- Aynı client birden fazla istek için devamlılık sağlamaktadır. Amaç client tanınmasıdır. bu şekilde stateful hale
  getirmiş oluruz.
- Session Id
    - Container , tekil bir session id bilgisi oluşturur. ve bunu response a verir / ekler.
    - Daha sonra client bir sonraki istekte bu session id bilgisi server a gönderir.
    - bu session id bilgisi , özel header olan Cookiler yardimiyla taşınır.
- HttpSession objesi oluşturmak
- unique session id oluşturmak
- cookie objesini oluşturmak
- cookie ilgili response vermek
- gibi işlemlerden ServletContainer sorumludur.

- session id bilgisi cookieler araciliğiyla taşınır.
- cookiler her tarayıcı için ayrı bulunur.
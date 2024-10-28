

### Handle Request

1- Son kullanici servlet i çağiran bir url browser üzrerinden tetikler.

2- Servlet container bu isteğe karşilik 2 tane obje oluşturur.
    a. HttpServletRequest
    b. HttpServletResponse
3- Container yeni bir thread oluşturur. Service metodu çağirir. 2 adımda oluşturulan request ve response objeleri bu metoda geçer.

4- Gelen istek get ise doGet 
   post isteği ise doPost methoduna yönlendirme yapılır.

5- İlgili method çalışır . doGet ,doPost ,doDelete ...
 istek karşilanir.

6- servis methodu sonlanir. thread sonlanır. 
 request ve response objeleri artık Garbage Collector tarafından temizlenir.

7- 
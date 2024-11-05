
 ### JSP Attribute
   - Çeşitli scopelara bıraktığımız veya eklediğimiz objeler: atribute
     - context
     - session
     - request
     - application
     - PageScope
   
 #### application scope:
   - Servlet
       - geServletContext().setAttribute("key",value)
   - JSP
       - application.setAttribute("key", value)

#### session scope:    
   - Servlet
     - request.getSession().setAttribute("key",value)
   - JSP
     - session.setAttribute("key", value)

#### request scope:
  - Servlet
    - request.setAttribute("key",value)
  - JSP
    - request.setAttribute("key", value)
# References Types Object & Pass By Value

### Mekanisme Memory pada Java
Java selalu pass by value yg dimaksud itu setiap variable baik itu tipe data primitives atau object/reference type selalu disimpan kedalam method/function yg dimana mekanisme method akan dibawa kedalam memory stack di dalam frame/method akan membawa tipe data nya masing" jika tipe data primitives maka value atau nilai asli nya akan di simpan di memory stack itu sendiri, tapi untuk reference type yg disimpan di memory stack hanya alamat bukan valuenya sedangkan nilai asli nya disimpan di memory heap.
String termasuk class maka dari itu dia termasuk reference type tapi ada perbedaan sedikit dibanding dengan reference type lain nya yaitu nilai asli nya disimpan di dalam string pool, yg ada di dalam heap. 
# MoviesDemo-Android
https://www.themoviedb.org sitesinin sağladığı API üzerinden vizyonda olan ve yakında vizyona girecek olan film listesinin çekildiği, ekrana listelediği bir projedir. Üst slider'da vizyonda olan, alt listede ise yakında vizyona girecek olan filmleri görebiliyoruz. Herhangi bir listeden filme tıklandığında onun detaylarını görüntüleyebiliyoruz.


## Kullanılan 3. Parti Kütüphaneler
- Picasso
- Kotlin Coroutines


## Kullanılan Mimari Ve Detayları
- Projede tasarım anlamında XML koduna yer verilmedi. Tasarımlar programatik olarak Kotlin dili ile yazıldı. 
- Her Activity ve Fragment'ların ConstraintLayout'dan türetilkmiş Layout katmanı bulunmaktadır. Bu katmanlar kendilerine ait Fragment veya Activity ile haberleşmektedir.
- Tek Activity, birden fazla Fragment mantığı temel alınmıştır.
- Activity, Fragment'ları tutma ve yönlendirme görevi görür.
- Fragment'lar ihtiyaca göre Primary Fragment, Secondary Fragment, Tertiary Fragment olarak alt bölümlere ayrılır.
- Her Fragment sınıfının ihtiyaç durumunda Logic işlemlerinin yapıldığı Interactor katmanı olabilir. Interactor sınıfları Coroutines sınıfından miras alır. Bu sayede gerekli olduğu durumlarda Coroutines teknolojisi ile Asnyc olarak kod parçacıklarını çalıştırabilir.
- Interactor sınıfı olan Fragment'lar birbirleri ile haberleşmesi mümkün olur.
- API işlemleri için WebService sınıfı mevcuttur. Bu sınıf Fragment'ların Interactor sınıfı ile iletişim halinde olurlar.
- Mimariye ait Flow Chart çizimini aşağıda inceleyebilirsiniz.

![github](https://github.com/nejatboy/MoviesDemo-Android/blob/main/Flow%20Chart.png)

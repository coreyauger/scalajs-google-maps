# scalajs-google-maps
Type-safe and Scala-friendly library over Google Maps.

## Dependency Info
[Scala.js](https://www.scala-js.org/).

[Google Maps api v3](https://developers.google.com/maps/documentation/javascript/)

## Get started
I assume that you have setup a ScalaJS project before.  If this is not the case you can follow the instructions and some basic example on the [Scala.js](https://www.scala-js.org/) homepage.

To get started you will need a google maps api key.  You can [get an api key here](https://developers.google.com/maps/documentation/javascript/tutorial#api_key).  

### Include google maps on your page
```html
 <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=API_KEY"></script>
```

### Build.sbt
Add the following dependency to your porject.

`resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"`

`"io.surfkit" %%% "scalajs-google-maps" % "0.0.3-SNAPSHOT",`

## Some Examples
Here are some of the google maps examples demonstrated in a type safe scalaJS way.

### Simple Map
Initialize a map to a location and zoom level.
```scala
object ScalaJSGMapExample extends js.JSApp {
  def main(): Unit = {
    
    def initialize() = js.Function {
      val opts = google.maps.MapOptions(
        center = new LatLng(51.201203, -1.724370),
        zoom = 8,
        panControl = false,
        streetViewControl = false,
        mapTypeControl = false)
        val gmap = new google.maps.Map(document.getElementById("map-canvas"), opts)
    }
    google.maps.event.addDomListener(window, "load", initialize)
  }
}
```
### Place a marker
Add a marker to the map.
```scala
object ScalaJSGMapExample extends js.JSApp {
  def main(): Unit = {
    
    def initialize() = js.Function {
      val opts = google.maps.MapOptions(
        center = new LatLng(51.201203, -1.724370),
        zoom = 8,
        panControl = false,
        streetViewControl = false,
        mapTypeControl = false)
        val gmap = new google.maps.Map(document.getElementById("map-canvas"), opts)
        
        val marker = new google.maps.Marker(google.maps.MarkerOptions(
          position = gmap.getCenter(),
          map = gmap,
          title = "Marker"
        ))
    }
    google.maps.event.addDomListener(window, "load", initialize)
  }
}
```
### Respond to events + Info Window
```scala
object ScalaJSGMapExample extends js.JSApp {
  def main(): Unit = {
    
    def initialize() = js.Function {
      val opts = google.maps.MapOptions(
        center = new LatLng(51.201203, -1.724370),
        zoom = 8,
        panControl = false,
        streetViewControl = false,
        mapTypeControl = false)
        val gmap = new google.maps.Map(document.getElementById("map-canvas"), opts)
        
        val marker = new google.maps.Marker(google.maps.MarkerOptions(
          position = gmap.getCenter(),
          map = gmap,
          title = "Marker"
        ))
        
         val contentString = """
            <div id="content">
            <h1 id="firstHeading" class="firstHeading">Hello World !!</h1>
            </div>
            """

        val infowindow = new google.maps.InfoWindow(google.maps.InfoWindowOptions(
          content=contentString
        ))

        google.maps.event.addListener(marker, "click", () => {
          println("Marker click !")
          infowindow.open(gmap,marker)
        })
    }
    google.maps.event.addDomListener(window, "load", initialize)
  }
}
```


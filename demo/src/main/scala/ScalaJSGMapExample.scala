package demo

import google.maps.Data.Feature
import google.maps.LatLng
import org.scalajs.dom._

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom

object ScalaJSGMapExample extends js.JSApp {
  def main(): Unit = {
    println("About to init map...")

    def initialize() = js.Function {
      val opts = google.maps.MapOptions(
        center = new LatLng(51.201203, -1.724370),
        zoom = 8,
        panControl = false,
        streetViewControl = false,
        mapTypeControl = false)
        val gmap = new google.maps.Map(document.getElementById("map-canvas"), opts)

      val data = new google.maps.Data(google.maps.Data.DataOptions(gmap))

      val latLng = new google.maps.LatLng(52.201203, -1.724370)
      val feature = new google.maps.Data.Feature(google.maps.Data.FeatureOptions(
        geometry = latLng,
        id = "Test feature",
        properties = null
      ))

      val feature2 = new google.maps.Data.Feature(google.maps.Data.FeatureOptions(
        geometry = new google.maps.LatLng(52.301203, -1.724470),
        id = "Test feature2",
        properties = null
      ))

      data.add(feature)

      data.forEach((feature: google.maps.Data.Feature) => {
        println(feature.getId());
      })

      val style = google.maps.Data.StyleOptions(
        clickable= true,
        cursor= "pointer",
        fillColor= "#79B55B",
        fillOpacity= 1,
        icon = null,
        shape = google.maps.MarkerShape(coords = js.Array(1, 2, 3), shape = "circle" ),
        strokeColor = "#79B55B",
        strokeOpacity = 1,
        strokeWeight= 1,
        title = "string",
        visible = true,
        zIndex=  1
      )


      data.overrideStyle(feature2, style)
      data.setStyle(style)
      println(s"Added new style", style)


      data.add(feature2)

      data.revertStyle(feature)

      def featureToGeoJson(f:Object):Unit = {
        println("featureToGeoJson")
        println(f)
      }

      data.toGeoJson(featureToGeoJson(_:Object))


      val marker = new google.maps.Marker(google.maps.MarkerOptions(
        position = gmap.getCenter(),
        map = gmap,
        title = "Click to zoom"
      ))

      google.maps.event.addListener(gmap, "center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
          gmap.panTo(marker.getPosition());
        }, 3000)
      })

      val contentString = """<div id="content">
      <div id="siteNotice">
      </div>
      <h1 id="firstHeading" class="firstHeading">Uluru</h1>
      <div id="bodyContent">
      <p><b>Uluru</b>, also referred to as <b>Ayers Rock</b>, is a large sandstone rock formation in the southern part of the '+
      Northern Territory, central Australia. It lies 335&#160;km (208&#160;mi)
      south west of the nearest large town, Alice Springs; 450&#160;km
      (280&#160;mi) by road. Kata Tjuta and Uluru are the two major
      features of the Uluru - Kata Tjuta National Park. Uluru is
      sacred to the Pitjantjatjara and Yankunytjatjara, the
      Aboriginal people of the area. It has many springs, waterholes,
      rock caves and ancient paintings. Uluru is listed as a World
      Heritage Site.</p>
      <p>Attribution: Uluru, <a href="https://en.wikipedia.org/w/index.php?title=Uluru&oldid=297882194">
      https://en.wikipedia.org/w/index.php?title=Uluru</a>
      (last visited June 22, 2009).</p>
      </div>
      </div>"""

      val infowindow = new google.maps.InfoWindow(google.maps.InfoWindowOptions(
        content=contentString
      ))

      google.maps.event.addListener(marker, "click", () => {
        println("Marker click !")
        infowindow.open(gmap,marker)
      })


      ""
    }
    google.maps.event.addDomListener(window, "load", initialize)

  }
}

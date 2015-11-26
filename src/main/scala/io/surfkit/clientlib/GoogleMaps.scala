
import scala.scalajs.js
import js.annotation._
import org.scalajs.dom._
//import org.scalajs.dom.raw.{HTMLInputElement,HTMLDivElement}
import scala.scalajs.js.Date


package google {

package maps {

import google.maps.Data.Geometry

@JSName("google.maps.MVCObject")
@js.native
class MVCObject extends js.Object {
  def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native

  def bindTo(key: String, target: MVCObject, targetKey: String = ???, noNotify: Boolean = ???): Unit = js.native

  def changed(key: String): Unit = js.native

  def get(key: String): js.Dynamic = js.native

  def notify(key: String): Unit = js.native

  def set(key: String, value: js.Any): Unit = js.native

  def setValues(values: js.Any): Unit = js.native

  def unbind(key: String): Unit = js.native

  def unbindAll(): Unit = js.native
}

@JSName("google.maps.MVCArray")
@js.native
class MVCArray protected() extends MVCObject {
  def this(array: js.Array[js.Any] = ???) = this()

  def clear(): Unit = js.native

  def forEach(callback: js.Function2[js.Any, Double, Unit]): Unit = js.native

  def getArray(): js.Array[js.Any] = js.native

  def getAt(i: Double): js.Dynamic = js.native

  def getLength(): Double = js.native

  def insertAt(i: Double, elem: js.Any): Unit = js.native

  def pop(): Unit = js.native

  def push(elem: js.Any): Double = js.native

  def removeAt(i: Double): js.Dynamic = js.native

  def setAt(i: Double, elem: js.Any): Unit = js.native
}

@JSName("google.maps.Map")
@js.native
class Map protected() extends MVCObject {
  def this(mapDiv: Element, opts: MapOptions = ???) = this()

  def fitBounds(bounds: LatLngBounds): Unit = js.native

  def getBounds(): LatLngBounds = js.native

  def getCenter(): LatLng = js.native

  def getDiv(): Element = js.native

  def getHeading(): Double = js.native

  def getMapTypeId(): MapTypeId = js.native

  def getProjection(): Projection = js.native

  def getStreetView(): StreetViewPanorama = js.native

  def getTilt(): Double = js.native

  def getZoom(): Double = js.native

  def panBy(x: Double, y: Double): Unit = js.native

  def panTo(latLng: LatLng): Unit = js.native

  def panToBounds(latLngBounds: LatLngBounds): Unit = js.native

  def setCenter(latlng: LatLng): Unit = js.native

  def setHeading(heading: Double): Unit = js.native

  def setMapTypeId(mapTypeId: MapTypeId): Unit = js.native

  def setOptions(options: MapOptions): Unit = js.native

  def setStreetView(panorama: StreetViewPanorama): Unit = js.native

  def setTilt(tilt: Double): Unit = js.native

  def setZoom(zoom: Double): Unit = js.native

  var controls: js.Array[MVCArray] = js.native
  var data: Data = js.native
  var mapTypes: MapTypeRegistry = js.native
  var overlayMapTypes: MVCArray = js.native
}

@js.native
trait MapOptions extends js.Object {
  var backgroundColor: String = js.native
  var center: LatLng = js.native
  var disableDefaultUI: Boolean = js.native
  var disableDoubleClickZoom: Boolean = js.native
  var draggable: Boolean = js.native
  var draggableCursor: String = js.native
  var draggingCursor: String = js.native
  var heading: Double = js.native
  var keyboardShortcuts: Boolean = js.native
  var mapMaker: Boolean = js.native
  var mapTypeControl: Boolean = js.native
  var mapTypeControlOptions: MapTypeControlOptions = js.native
  var navigationControl: Boolean = js.native
  var navigationControlOptions: NavigationControlOptions = js.native
  var mapTypeId: MapTypeId = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var noClear: Boolean = js.native
  var overviewMapControl: Boolean = js.native
  var overviewMapControlOptions: OverviewMapControlOptions = js.native
  var panControl: Boolean = js.native
  var panControlOptions: PanControlOptions = js.native
  var rotateControl: Boolean = js.native
  var rotateControlOptions: RotateControlOptions = js.native
  var scaleControl: Boolean = js.native
  var scaleControlOptions: ScaleControlOptions = js.native
  var scrollwheel: Boolean = js.native
  var streetView: StreetViewPanorama = js.native
  var streetViewControl: Boolean = js.native
  var streetViewControlOptions: StreetViewControlOptions = js.native
  var styles: js.Array[MapTypeStyle] = js.native
  var tilt: Double = js.native
  var zoom: Double = js.native
  var zoomControl: Boolean = js.native
  var zoomControlOptions: ZoomControlOptions = js.native
}


object MapOptions {
  def apply(
        backgroundColor: String = null,
        center: LatLng,
        disableDefaultUI: Boolean = false,
        disableDoubleClickZoom: Boolean = false,
        draggable: Boolean = true,
        draggableCursor: String = null,
        draggingCursor: String = null,
        //heading: Double = 0.0,
        keyboardShortcuts: Boolean = true,
        mapMaker: Boolean = false,
        mapTypeControl: Boolean = true,
        mapTypeControlOptions: MapTypeControlOptions = null,
        navigationControl: Boolean = true,
        navigationControlOptions: NavigationControlOptions = null,
        mapTypeId: MapTypeId = MapTypeId.ROADMAP,
        //maxZoom: Double = null,
        //minZoom: Double = null,
        noClear: Boolean = true,
        overviewMapControl: Boolean = true,
        overviewMapControlOptions: OverviewMapControlOptions = null,
        panControl: Boolean = true,
        panControlOptions: PanControlOptions = null,
        rotateControl: Boolean = false,
        rotateControlOptions: RotateControlOptions = null,
        scaleControl: Boolean = true,
        scaleControlOptions: ScaleControlOptions = null,
        scrollwheel: Boolean = true,
        streetView: StreetViewPanorama = null,
        streetViewControl: Boolean = true,
        streetViewControlOptions: StreetViewControlOptions = null,
        styles: js.Array[MapTypeStyle] = null,
        //tilt: Double = null,
        zoom: Double,
        zoomControl: Boolean = true,
        zoomControlOptions: ZoomControlOptions = null
             ): MapOptions = {
    js.Dynamic.literal(
        backgroundColor = backgroundColor,
        center = center,

        disableDefaultUI= disableDefaultUI,
        disableDoubleClickZoom = disableDoubleClickZoom,
        draggable = draggable,
        draggableCursor= draggableCursor,
        draggingCursor= draggingCursor,
      //  heading = heading,

          keyboardShortcuts=keyboardShortcuts,
          mapMaker=mapMaker,
          mapTypeControl=mapTypeControl,
          mapTypeControlOptions=mapTypeControlOptions,
          navigationControl=navigationControl,
          navigationControlOptions=navigationControlOptions,
          mapTypeId=mapTypeId,

          //  maxZoom=maxZoom,
          //  minZoom=minZoom,
            noClear=noClear,
            overviewMapControl=overviewMapControl,
            overviewMapControlOptions=overviewMapControlOptions,
            panControl=panControl,
            panControlOptions=panControlOptions,
            rotateControl=rotateControl,
            rotateControlOptions=rotateControlOptions,
            scaleControl=scaleControl,
            scaleControlOptions=scaleControlOptions,
            scrollwheel=scrollwheel,
            streetView=streetView,
            streetViewControl=streetViewControl,
            streetViewControlOptions=streetViewControlOptions,
            styles=styles,
          //  tilt=tilt,

        zoom=zoom,
        zoomControl=zoomControl,
        zoomControlOptions=zoomControlOptions
    ).asInstanceOf[MapOptions]
  }
}


@js.native
sealed trait MapTypeId extends js.Object {
}

@JSName("google.maps.MapTypeId")
@js.native
object MapTypeId extends js.Object {
  var HYBRID: MapTypeId = js.native
  var ROADMAP: MapTypeId = js.native
  var SATELLITE: MapTypeId = js.native
  var TERRAIN: MapTypeId = js.native

  @JSBracketAccess
  def apply(value: MapTypeId): String = js.native
}

@js.native
trait MapTypeControlOptions extends js.Object {
  var mapTypeIds: js.Array[MapTypeId] = js.native
  var position: ControlPosition = js.native
  var style: MapTypeControlStyle = js.native
}

@js.native
sealed trait MapTypeControlStyle extends js.Object {
}

@JSName("google.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends js.Object {
  var DEFAULT: MapTypeControlStyle = js.native
  var DROPDOWN_MENU: MapTypeControlStyle = js.native
  var HORIZONTAL_BAR: MapTypeControlStyle = js.native

  @JSBracketAccess
  def apply(value: MapTypeControlStyle): String = js.native
}

@js.native
trait OverviewMapControlOptions extends js.Object {
  var opened: Boolean = js.native
}

@js.native
trait PanControlOptions extends js.Object {
  var position: ControlPosition = js.native
}

@js.native
trait RotateControlOptions extends js.Object {
  var position: ControlPosition = js.native
}

@js.native
trait ScaleControlOptions extends js.Object {
  var position: ControlPosition = js.native
  var style: ScaleControlStyle = js.native
}

@js.native
sealed trait ScaleControlStyle extends js.Object {
}

@JSName("google.maps.ScaleControlStyle")
@js.native
object ScaleControlStyle extends js.Object {
  var DEFAULT: ScaleControlStyle = js.native

  @JSBracketAccess
  def apply(value: ScaleControlStyle): String = js.native
}

@js.native
trait StreetViewControlOptions extends js.Object {
  var position: ControlPosition = js.native
}

@js.native
trait ZoomControlOptions extends js.Object {
  var position: ControlPosition = js.native
  var style: ZoomControlStyle = js.native
}

@js.native
sealed trait ZoomControlStyle extends js.Object {
}

@JSName("google.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends js.Object {
  var DEFAULT: ZoomControlStyle = js.native
  var LARGE: ZoomControlStyle = js.native
  var SMALL: ZoomControlStyle = js.native

  @JSBracketAccess
  def apply(value: ZoomControlStyle): String = js.native
}

@js.native
sealed trait ControlPosition extends js.Object {
}

@JSName("google.maps.ControlPosition")
@js.native
object ControlPosition extends js.Object {
  var BOTTOM_CENTER: ControlPosition = js.native
  var BOTTOM_LEFT: ControlPosition = js.native
  var BOTTOM_RIGHT: ControlPosition = js.native
  var LEFT_BOTTOM: ControlPosition = js.native
  var LEFT_CENTER: ControlPosition = js.native
  var LEFT_TOP: ControlPosition = js.native
  var RIGHT_BOTTOM: ControlPosition = js.native
  var RIGHT_CENTER: ControlPosition = js.native
  var RIGHT_TOP: ControlPosition = js.native
  var TOP_CENTER: ControlPosition = js.native
  var TOP_LEFT: ControlPosition = js.native
  var TOP_RIGHT: ControlPosition = js.native

  @JSBracketAccess
  def apply(value: ControlPosition): String = js.native
}

@js.native
trait NavigationControlOptions extends js.Object {
  var position: ControlPosition = js.native
  var style: NavigationControlStyle = js.native
}

@js.native
sealed trait NavigationControlStyle extends js.Object {
}

@JSName("google.maps.NavigationControlStyle")
@js.native
object NavigationControlStyle extends js.Object {
  var DEFAULT: NavigationControlStyle = js.native
  var SMALL: NavigationControlStyle = js.native
  var ANDROID: NavigationControlStyle = js.native
  var ZOOM_PAN: NavigationControlStyle = js.native

  @JSBracketAccess
  def apply(value: NavigationControlStyle): String = js.native
}

@JSName("google.maps.Data")
@js.native
class Data protected() extends MVCObject {
  def this(options: Data.DataOptions = ???) = this()

  def add(feature: Data.Feature): Data.Feature = js.native

  def addGeoJson(geoJson: Object, options: Data.GeoJsonOptions = ???): js.Array[Data.Feature] = js.native

  def contains(feature: Data.Feature): Boolean = js.native

  def forEach(callback: js.Function1[Data.Feature, Unit]): Unit = js.native

  def getFeatureById(id: Double): Data.Feature = js.native

  def getMap(): Map = js.native

  def getStyle(): Data.StyleOptions = js.native

  def loadGeoJson(url: String, options: Data.GeoJsonOptions = ???, callback: js.Function1[js.Array[Data.Feature], Unit] = ???): Unit = js.native

  def overrideStyle(feature: Data.Feature, style: Data.StyleOptions): Unit = js.native

  def remove(feature: Data.Feature): Unit = js.native

  def revertStyle(feature: Data.Feature = ???): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setStyle(style: Data.StyleOptions): Unit = js.native

  def toGeoJson(callback: js.Function1[Object, Unit]): Unit = js.native
}

object Data {
  @js.native
trait DataOptions extends js.Object {
  var map: Map = js.native
}

  object DataOptions{
    def apply(gmap:Map) ={
      js.Dynamic.literal(
        map = gmap
      ).asInstanceOf[DataOptions]
    }
  }

  @js.native
trait GeoJsonOptions extends js.Object {
  var idPropertyName: String = js.native
}

  @js.native
trait StyleOptions extends js.Object {
  var clickable: Boolean = js.native
  var cursor: String = js.native
  var fillColor: String = js.native
  var fillOpacity: Double = js.native
  var icon: js.Any = js.native
  var shape: MarkerShape = js.native
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokeWeight: Double = js.native
  var title: String = js.native
  var visible: Boolean = js.native
  var zIndex: Double = js.native
}
  object StyleOptions{
    def apply(
               clickable:Boolean = true,
               cursor: String = "",
               fillColor: String = "",
               fillOpacity: Double = 1.0,
               icon: js.Any = null,
               shape: MarkerShape = null,
               strokeColor:String = "",
               strokeOpacity:Double = 1.0,
               strokeWeight:Double = 1.0,
               title: String = "",
               visible: Boolean = true,
               zIndex: Double = 1.0
            ):StyleOptions ={
      js.Dynamic.literal(
        clickable= clickable,
        cursor = cursor,
        fillColor = fillColor,
        fillOpacity =fillOpacity,
        icon = icon,
        shape=shape,
        strokeColor=strokeColor,
        strokeOpacity=strokeOpacity,
        strokeWeight=strokeWeight,
        title=title,
        visible=visible,
        zIndex=zIndex
      ).asInstanceOf[StyleOptions]
    }
  }

  type StylingFunction = (Data.Feature) => Data.StyleOptions

@JSName("google.maps.Data.Feature")
@js.native
class Feature protected() extends js.Object {
  def this(options: Data.FeatureOptions = ???) = this()

  def forEachProperty(callback: js.Function2[js.Any, String, Unit]): Unit = js.native

  def getGeometry(): Data.Geometry = js.native

  def getId(): String = js.native

  def getProperty(name: String): js.Dynamic = js.native

  def removeProperty(name: String): Unit = js.native

  def setGeometry(newGeometry: Data.Geometry): Unit = js.native

  def setProperty(name: String, newValue: js.Any): Unit = js.native

  def toGeoJson(callback: js.Function1[Object, Unit]): Unit = js.native
}

  @js.native
trait FeatureOptions extends js.Object {
  var geometry: Data.Geometry = js.native
  var id: String = js.native
  var properties: Object = js.native
}

  object FeatureOptions{
    def apply(geometry: Data.Geometry, id: String, properties:js.Any = null):FeatureOptions = {
      js.Dynamic.literal(
        geometry = geometry,
        id = id,
        properties = properties
      ).asInstanceOf[FeatureOptions]
    }
  }

@JSName("google.maps.Data.Geometry")
@js.native
class Geometry extends js.Object {
  def getType(): String = js.native
}

@JSName("google.maps.Data.Point")
@js.native
class Point protected() extends Data.Geometry {
  def this(latLng: LatLng) = this()

  def get(): LatLng = js.native
}

@JSName("google.maps.Data.MultiPoint")
@js.native
class MultiPoint protected() extends Data.Geometry {
  def this(elements: js.Array[LatLng]) = this()

  def getAt(n: Double): LatLng = js.native

  def getLength(): Double = js.native
}

@JSName("google.maps.Data.LineString")
@js.native
class LineString protected() extends Data.Geometry {
  def this(elements: js.Array[LatLng]) = this()

  def getArray(): js.Array[LatLng] = js.native

  def getAt(n: Double): LatLng = js.native

  def getLength(): Double = js.native
}

@JSName("google.maps.Data.MultiLineString")
@js.native
class MultiLineString protected() extends Data.Geometry {
  def this(elements: js.Array[Data.LineString]) = this()

  def getArray(): js.Array[Data.LineString] = js.native

  def getAt(n: Double): Data.LineString = js.native

  def getLength(): Double = js.native
}

@JSName("google.maps.Data.LinearRing")
@js.native
class LinearRing protected() extends Data.Geometry {
  def this(elements: js.Array[LatLng]) = this()

  def getArray(): js.Array[LatLng] = js.native

  def getAt(n: Double): LatLng = js.native

  def getLength(): Double = js.native
}

@JSName("google.maps.Data.Polygon")
@js.native
class Polygon protected() extends Data.Geometry {
  def this(elements: js.Array[LinearRing]) = this()

  def getArray(): js.Array[LinearRing] = js.native

  def getAt(n: Double): LinearRing = js.native

  def getLength(): Double = js.native
}

@JSName("google.maps.Data.MultiPolygon")
@js.native
class MultiPolygon protected() extends Data.Geometry {
  def this(elements: js.Array[Data.Polygon]) = this()

  def getArray(): js.Array[Data.Polygon] = js.native

  def getAt(n: Double): Data.Polygon = js.native

  def getLength(): Double = js.native
}

@JSName("google.maps.Data.GeometryCollection")
@js.native
class GeometryCollection protected() extends Data.Geometry {
  def this(elements: js.Array[Data.Geometry]) = this()

  def getArray(): js.Array[Data.Geometry] = js.native

  def getAt(n: Double): Data.Geometry = js.native

  def getLength(): Double = js.native
}

@js.native
trait MouseEvent extends google.maps.MouseEvent {
  var feature: Data.Feature = js.native
}

@js.native
trait AddFeatureEvent extends js.Object {
  var feature: Data.Feature = js.native
}

@js.native
trait RemoveFeatureEvent extends js.Object {
  var feature: Data.Feature = js.native
}

@js.native
trait SetGeometryEvent extends js.Object {
  var feature: Data.Feature = js.native
  var newGeometry: Data.Geometry = js.native
  var oldGeometry: Data.Geometry = js.native
}

@js.native
trait SetPropertyEvent extends js.Object {
  var feature: Data.Feature = js.native
  var name: String = js.native
  var newValue: js.Any = js.native
  var oldValue: js.Any = js.native
}

@js.native
trait RemovePropertyEvent extends js.Object {
  var feature: Data.Feature = js.native
  var name: String = js.native
  var oldValue: js.Any = js.native
}

}

@JSName("google.maps.Marker")
@js.native
class Marker protected() extends MVCObject {
  def this(opts: MarkerOptions = ???) = this()

  def getAnimation(): Animation = js.native

  def getClickable(): Boolean = js.native

  def getCursor(): String = js.native

  def getDraggable(): Boolean = js.native

  def getFlat(): Boolean = js.native

  def getIcon(): MarkerImage = js.native

  def getMap(): js.Dynamic = js.native

  def getPosition(): LatLng = js.native

  def getShadow(): MarkerImage = js.native

  def getShape(): MarkerShape = js.native

  def getTitle(): String = js.native

  def getVisible(): Boolean = js.native

  def getZIndex(): Double = js.native

  def setAnimation(animation: Animation): Unit = js.native

  def setClickable(flag: Boolean): Unit = js.native

  def setCursor(cursor: String): Unit = js.native

  def setDraggable(flag: Boolean): Unit = js.native

  def setFlat(flag: Boolean): Unit = js.native

  def setIcon(icon: MarkerImage): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: MarkerOptions): Unit = js.native

  def setPosition(latlng: LatLng): Unit = js.native

  def setShadow(shadow: MarkerImage): Unit = js.native

  def setShape(shape: MarkerShape): Unit = js.native

  def setTitle(title: String): Unit = js.native

  def setVisible(visible: Boolean): Unit = js.native

  def setZIndex(zIndex: Double): Unit = js.native
}

@JSName("google.maps.Marker")
@js.native
object Marker extends js.Object {
  var MAX_ZINDEX: Double = js.native
}

@js.native
trait MarkerOptions extends js.Object {
  var animation: Animation = js.native
  var clickable: Boolean = js.native
  var cursor: String = js.native
  var draggable: Boolean = js.native
  var flat: Boolean = js.native
  var icon: js.Any = js.native
  var map: js.Any = js.native
  var optimized: Boolean = js.native
  var position: LatLng = js.native
  var raiseOnDrag: Boolean = js.native
  var shadow: js.Any = js.native
  var shape: MarkerShape = js.native
  var title: String = js.native
  var visible: Boolean = js.native
  var zIndex: Double = js.native
}

  object MarkerOptions{
    def apply(
      animation: js.UndefOr[Animation] = js.undefined,
      clickable: js.UndefOr[Boolean] = js.undefined,
      cursor: js.UndefOr[String] = js.undefined,
      draggable: js.UndefOr[Boolean] = js.undefined,
      flat: js.UndefOr[Boolean] = js.undefined,
      icon: js.UndefOr[js.Any] = js.undefined,
      map: Map,
      optimized: js.UndefOr[Boolean] = js.undefined,
      position: LatLng,
      raiseOnDrag: js.UndefOr[Boolean] = js.undefined,
      shadow: js.UndefOr[js.Any] = js.undefined,
      shape: js.UndefOr[MarkerShape ] = js.undefined,
      title: js.UndefOr[String] = js.undefined,
      visible: js.UndefOr[Boolean] = js.undefined,
      zIndex: js.UndefOr[Double] = js.undefined
               ):MarkerOptions ={
      val result = js.Dynamic.literal()
      clickable.foreach(result.clickable = _)
      cursor.foreach(result.cursor = _)
      draggable.foreach(result.draggable = _)
      flat.foreach(result.flat = _)
      icon.foreach(result.icon = _)
      result.map = map
      optimized.foreach(result.optimized = _)
      optimized.foreach(result.optimized = _)
      result.position = position
      raiseOnDrag.foreach(result.raiseOnDrag = _)
      shadow.foreach(result.shadow = _)
      shape.foreach(result.shape = _)
      title.foreach(result.title = _)
      visible.foreach(result.visible = _)
      zIndex.foreach(result.zIndex = _)
      result.asInstanceOf[MarkerOptions]
    }
  }

@js.native
trait MarkerImage extends js.Object {
  var anchor: Point = js.native
  var origin: Point = js.native
  var scaledSize: Size = js.native
  var size: Size = js.native
  var url: String = js.native
}

object MarkerImage{
  def apply(
      anchor: js.UndefOr[Point] = js.undefined,
      origin: js.UndefOr[Point] = js.undefined,
      scaledSize: js.UndefOr[Size] = js.undefined,
      size: Size,
      url: String):MarkerImage = {
    val result = js.Dynamic.literal()
    result.size = size
    result.url = url
    anchor.foreach(result.anchor = _)
    origin.foreach(result.origin = _)
    scaledSize.foreach(result.scaledSize = _)
    result.asInstanceOf[MarkerImage]
  }
}

@js.native
trait MarkerShape extends js.Object {
  var coords: js.Array[Double] = js.native
  var `type`: String = js.native
}

  object MarkerShape{
    def apply(coords:js.Array[Double], shape:String = ""):MarkerShape = {
      js.Dynamic.literal(
        coords = coords,
        `type` = shape
      ).asInstanceOf[MarkerShape]
    }
  }
@js.native
trait Symbol extends js.Object {
  var anchor: Point = js.native
  var fillColor: String = js.native
  var fillOpacity: Double = js.native
  var path: js.Any = js.native
  var rotation: Double = js.native
  var scale: Double = js.native
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokeWeight: Double = js.native
}
@js.native
sealed trait SymbolPath extends js.Object {
}

@JSName("google.maps.SymbolPath")
@js.native
object SymbolPath extends js.Object {
  var BACKWARD_CLOSED_ARROW: SymbolPath = js.native
  var BACKWARD_OPEN_ARROW: SymbolPath = js.native
  var CIRCLE: SymbolPath = js.native
  var FORWARD_CLOSED_ARROW: SymbolPath = js.native
  var FORWARD_OPEN_ARROW: SymbolPath = js.native

  @JSBracketAccess
  def apply(value: SymbolPath): String = js.native
}

@js.native
sealed trait Animation extends js.Object {
}

@JSName("google.maps.Animation")
@js.native
object Animation extends js.Object {
  var BOUNCE: Animation = js.native
  var DROP: Animation = js.native

  @JSBracketAccess
  def apply(value: Animation): String = js.native
}

@JSName("google.maps.InfoWindow")
@js.native
class InfoWindow protected() extends MVCObject {
  def this(opts: InfoWindowOptions = ???) = this()

  def close(): Unit = js.native

  def getContent(): js.Dynamic = js.native

  def getPosition(): LatLng = js.native

  def getZIndex(): Double = js.native

  def open(map: Map = ???, anchor: MVCObject = ???): Unit = js.native

  def setContent(content: Node): Unit = js.native

  def setOptions(options: InfoWindowOptions): Unit = js.native

  def setPosition(position: LatLng): Unit = js.native

  def setZIndex(zIndex: Double): Unit = js.native
}

@js.native
trait InfoWindowOptions extends js.Object {
  var content: js.Any = js.native
  var disableAutoPan: Boolean = js.native
  var maxWidth: Double = js.native
  var pixelOffset: Size = js.native
  var position: LatLng = js.native
  var zIndex: Double = js.native
}

  object InfoWindowOptions{
    def apply(
               content: String = "<div>Hello World!</div>",
               disableAutoPan:Boolean = false,
               maxWidth:Double = Double.MaxValue,
               pixelOffset:Size = null,
               position:LatLng = null,
               zIndex:Double = 1.0):InfoWindowOptions ={
      js.Dynamic.literal(
        content =content,
        disableAutoPan = disableAutoPan,
        maxWidth = maxWidth,
        pixelOffset = pixelOffset,
        position = position,
        zIndex = zIndex
      ).asInstanceOf[InfoWindowOptions]
    }
  }

@JSName("google.maps.Polyline")
@js.native
class Polyline protected() extends MVCObject {
  def this(opts: PolylineOptions = ???) = this()

  def getDraggable(): Boolean = js.native

  def getEditable(): Boolean = js.native

  def getMap(): Map = js.native

  def getPath(): MVCArray = js.native

  def getVisible(): Boolean = js.native

  def setDraggable(draggable: Boolean): Unit = js.native

  def setEditable(editable: Boolean): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: PolylineOptions): Unit = js.native

  def setPath(path: MVCArray): Unit = js.native

  def setVisible(visible: Boolean): Unit = js.native
}

@js.native
trait PolylineOptions extends js.Object {
  var clickable: Boolean = js.native
  var draggable: Boolean = js.native
  var editable: Boolean = js.native
  var geodesic: Boolean = js.native
  var icons: js.Array[IconSequence] = js.native
  var map: Map = js.native
  var path: js.Array[js.Any] = js.native
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokeWeight: Double = js.native
  var visible: Boolean = js.native
  var zIndex: Double = js.native
}

  object PolylineOptions{
    def apply(
      clickable: Boolean = false,
      draggable: Boolean = false,
      editable: Boolean = false,
      geodesic: Boolean = false,
      icons: js.Array[IconSequence] = null,
      map: Map = null,
      path: js.Array[js.Any] = null,
      strokeColor: String = "",
      strokeOpacity: Double = 1.0,
      strokeWeight: Double = 1.0,
      visible: Boolean = true,
      zIndex: Double = 1.0
               ):PolylineOptions = {
      js.Dynamic.literal(
        clickable = clickable,
        draggable =draggable,
        editable= editable,
        geodesic = geodesic,
        icons = icons,
        map = map,
        path = path,
        strokeColor = strokeColor,
        strokeOpacity = strokeOpacity,
        strokeWeight = strokeWeight,
        visible = visible,
        zIndex = zIndex
      ).asInstanceOf[PolylineOptions]
    }
  }

@js.native
trait IconSequence extends js.Object {
  var fixedRotation: Boolean = js.native
  var icon: Symbol = js.native
  var offset: String = js.native
  var repeat: String = js.native
}

@JSName("google.maps.Polygon")
@js.native
class Polygon protected() extends MVCObject {
  def this(opts: PolygonOptions = ???) = this()

  def getDraggable(): Boolean = js.native

  def getEditable(): Boolean = js.native

  def getMap(): Map = js.native

  def getPath(): MVCArray = js.native

  def getPaths(): MVCArray = js.native

  def getVisible(): Boolean = js.native

  def setDraggable(draggable: Boolean): Unit = js.native

  def setEditable(editable: Boolean): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: PolygonOptions): Unit = js.native

  def setPath(path: MVCArray): Unit = js.native

  def setPaths(paths: MVCArray): Unit = js.native

  def setPaths(path: js.Array[LatLng]): Unit = js.native

  def setVisible(visible: Boolean): Unit = js.native
}

@js.native
trait PolygonOptions extends js.Object {
  var clickable: Boolean = js.native
  var draggable: Boolean = js.native
  var editable: Boolean = js.native
  var fillColor: String = js.native
  var fillOpacity: Double = js.native
  var geodesic: Boolean = js.native
  var map: Map = js.native
  var paths: js.Array[js.Any] = js.native
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokePosition: StrokePosition = js.native
  var strokeWeight: Double = js.native
  var visible: Boolean = js.native
  var zIndex: Double = js.native
}

  object PolygonOptions{
    def apply(
        clickable: Boolean = false,
        draggable: Boolean = false,
        editable: Boolean = false,
        fillColor: String = "",
        fillOpacity: Double = 1.0,
        geodesic: Boolean = false,
        map: Map = null,
        paths: js.Array[js.Any] = null,
        strokeColor: String = "",
        strokeOpacity: Double = 1.0,
        strokePosition: StrokePosition = null,
        strokeWeight: Double = 1.0,
        visible: Boolean = true,
        zIndex: Double = 1.0):PolygonOptions ={
      js.Dynamic.literal(
        clickable = clickable,
        draggable = draggable,
        editable = editable,
        fillColor = fillColor,
        fillOpacity = fillOpacity,
        geodesic = geodesic,
        map = map,
        paths = paths,
        strokeColor = strokeColor,
        strokeOpacity = strokeOpacity,
        strokePosition = strokePosition,
        strokeWeight = strokeWeight,
        visible = visible,
        zIndex = zIndex
      ).asInstanceOf[PolygonOptions]
    }
  }

@js.native
trait PolyMouseEvent extends js.Object {
  var edge: Double = js.native
  var path: Double = js.native
  var vertex: Double = js.native
}

@JSName("google.maps.Rectangle")
@js.native
class Rectangle protected() extends MVCObject {
  def this(opts: RectangleOptions = ???) = this()

  def getBounds(): LatLngBounds = js.native

  def getDraggable(): Boolean = js.native

  def getEditable(): Boolean = js.native

  def getMap(): Map = js.native

  def getVisible(): Boolean = js.native

  def setBounds(bounds: LatLngBounds): Unit = js.native

  def setDraggable(draggable: Boolean): Unit = js.native

  def setEditable(editable: Boolean): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: RectangleOptions): Unit = js.native

  def setVisible(visible: Boolean): Unit = js.native
}

@js.native
trait RectangleOptions extends js.Object {
  var bounds: LatLngBounds = js.native
  var clickable: Boolean = js.native
  var draggable: Boolean = js.native
  var editable: Boolean = js.native
  var fillColor: String = js.native
  var fillOpacity: Double = js.native
  var map: Map = js.native
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokePosition: StrokePosition = js.native
  var strokeWeight: Double = js.native
  var visible: Boolean = js.native
  var zIndex: Double = js.native
}

  object RectangleOptions{
    def apply(
         bounds: LatLngBounds = null,
         clickable: Boolean = false,
         draggable: Boolean = false,
         editable: Boolean = false,
         fillColor: String = "",
         fillOpacity: Double = 1.0,
         map: Map = null,
         paths: js.Array[js.Any] = null,
         strokeColor: String = "",
         strokeOpacity: Double = 1.0,
         strokePosition: StrokePosition = null,
         strokeWeight: Double = 1.0,
         visible: Boolean = true,
         zIndex: Double = 1.0
               ):RectangleOptions = {
      js.Dynamic.literal(
        bounds = bounds,
        clickable = clickable,
        draggable = draggable,
        editable = editable,
        fillColor = fillColor,
        fillOpacity = fillOpacity,
        map = map,
        paths = paths,
        strokeColor = strokeColor,
        strokeOpacity = strokeOpacity,
        strokePosition = strokePosition,
        strokeWeight = strokeWeight,
        visible = visible,
        zIndex = zIndex
      ).asInstanceOf[RectangleOptions]
    }
  }

@JSName("google.maps.Circle")
@js.native
class Circle protected() extends MVCObject {
  def this(opts: CircleOptions = ???) = this()

  def getBounds(): LatLngBounds = js.native

  def getCenter(): LatLng = js.native

  def getDraggable(): Boolean = js.native

  def getEditable(): Boolean = js.native

  def getMap(): Map = js.native

  def getRadius(): Double = js.native

  def getVisible(): Boolean = js.native

  def setCenter(center: LatLng): Unit = js.native

  def setDraggable(draggable: Boolean): Unit = js.native

  def setEditable(editable: Boolean): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: CircleOptions): Unit = js.native

  def setRadius(radius: Double): Unit = js.native

  def setVisible(visible: Boolean): Unit = js.native
}

@js.native
trait CircleOptions extends js.Object {
  var center: LatLng = js.native
  var clickable: Boolean = js.native
  var draggable: Boolean = js.native
  var editable: Boolean = js.native
  var fillColor: String = js.native
  var fillOpacity: Double = js.native
  var map: Map = js.native
  var radius: Double = js.native
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokePosition: StrokePosition = js.native
  var strokeWeight: Double = js.native
  var visible: Boolean = js.native
  var zIndex: Double = js.native
}


object CircleOptions{
  def apply(
             center: LatLng = null,
             clickable: Boolean = false,
             draggable: Boolean = false,
             editable: Boolean = false,
             fillColor: String = "",
             fillOpacity: Double = 1.0,
             map: Map = null,
             radius: Double = 1.0,
             strokeColor: String = "",
             strokeOpacity: Double = 1.0,
             strokePosition: StrokePosition = null,
             strokeWeight: Double = 1.0,
             visible: Boolean = true,
             zIndex: Double = 1.0
             ):CircleOptions = {
    js.Dynamic.literal(
      center = center,
      clickable = clickable,
      draggable = draggable,
      editable = editable,
      fillColor = fillColor,
      fillOpacity = fillOpacity,
      map = map,
      radius = radius,
      strokeColor = strokeColor,
      strokeOpacity = strokeOpacity,
      strokePosition = strokePosition,
      strokeWeight = strokeWeight,
      visible = visible,
      zIndex = zIndex
    ).asInstanceOf[CircleOptions]
  }
}

@js.native
sealed trait StrokePosition extends js.Object {
}

@JSName("google.maps.StrokePosition")
@js.native
object StrokePosition extends js.Object {
  var CENTER: StrokePosition = js.native
  var INSIDE: StrokePosition = js.native
  var OUTSIDE: StrokePosition = js.native

  @JSBracketAccess
  def apply(value: StrokePosition): String = js.native
}

@JSName("google.maps.GroundOverlay")
@js.native
class GroundOverlay protected() extends MVCObject {
  def this(url: String, bounds: LatLngBounds, opts: GroundOverlayOptions = ???) = this()

  def getBounds(): LatLngBounds = js.native

  def getMap(): Map = js.native

  def getOpacity(): Double = js.native

  def getUrl(): String = js.native

  def setMap(map: Map): Unit = js.native

  def setOpacity(opacity: Double): Unit = js.native
}

@js.native
trait GroundOverlayOptions extends js.Object {
  var clickable: Boolean = js.native
  var map: Map = js.native
  var opacity: Double = js.native
}



object GroundOverlayOptions{
  def apply(
             clickable: Boolean = false,
             map: Map = null,
             opacity: Double = 1.0
             ):GroundOverlayOptions = {
    js.Dynamic.literal(
      clickable = clickable,
      map = map,
      opacity = opacity
    ).asInstanceOf[GroundOverlayOptions]
  }
}

@JSName("google.maps.OverlayView")
@js.native
class OverlayView extends MVCObject {
  def draw(): Unit = js.native

  def getMap(): Map = js.native

  def getPanes(): MapPanes = js.native

  def getProjection(): MapCanvasProjection = js.native

  def onAdd(): Unit = js.native

  def onRemove(): Unit = js.native

  def setMap(map: Map): Unit = js.native
}

@js.native
trait MapPanes extends js.Object {
  var floatPane: Element = js.native
  var floatShadow: Element = js.native
  var mapPane: Element = js.native
  var overlayImage: Element = js.native
  var overlayLayer: Element = js.native
  var overlayMouseTarget: Element = js.native
  var overlayShadow: Element = js.native
}

@JSName("google.maps.MapCanvasProjection")
@js.native
class MapCanvasProjection extends MVCObject {
  def fromContainerPixelToLatLng(pixel: Point, nowrap: Boolean = ???): LatLng = js.native

  def fromDivPixelToLatLng(pixel: Point, nowrap: Boolean = ???): LatLng = js.native

  def fromLatLngToContainerPixel(latLng: LatLng): Point = js.native

  def fromLatLngToDivPixel(latLng: LatLng): Point = js.native

  def getWorldWidth(): Double = js.native
}

@JSName("google.maps.Geocoder")
@js.native
class Geocoder extends js.Object {
  def geocode(request: GeocoderRequest, callback: js.Function2[js.Array[GeocoderResult], GeocoderStatus, Unit]): Unit = js.native
}

@js.native
trait GeocoderRequest extends js.Object {
  var address: String = js.native
  var bounds: LatLngBounds = js.native
  var location: LatLng = js.native
  var region: String = js.native
}

  object GeocoderRequest{
    def apply(
      address: js.UndefOr[String] = js.undefined,
      bounds: js.UndefOr[LatLngBounds] = js.undefined,
      location: js.UndefOr[LatLng] = js.undefined,
      region: js.UndefOr[String] = js.undefined
               ):GeocoderRequest ={
      val result = js.Dynamic.literal()
      address.foreach(result.address = _)
      bounds.foreach(result.bounds = _)
      location.foreach(result.location = _)
      region.foreach(result.region = _)
      result.asInstanceOf[GeocoderRequest]
    }
  }

@js.native
sealed trait GeocoderStatus extends js.Object {
}

@JSName("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends js.Object {
  var ERROR: GeocoderStatus = js.native
  var INVALID_REQUEST: GeocoderStatus = js.native
  var OK: GeocoderStatus = js.native
  var OVER_QUERY_LIMIT: GeocoderStatus = js.native
  var REQUEST_DENIED: GeocoderStatus = js.native
  var UNKNOWN_ERROR: GeocoderStatus = js.native
  var ZERO_RESULTS: GeocoderStatus = js.native

  @JSBracketAccess
  def apply(value: GeocoderStatus): String = js.native
}

@js.native
trait GeocoderResult extends js.Object {
  var address_components: js.Array[GeocoderAddressComponent] = js.native
  var formatted_address: String = js.native
  var geometry: GeocoderGeometry = js.native
  var types: js.Array[String] = js.native
}

@js.native
trait GeocoderAddressComponent extends js.Object {
  var long_name: String = js.native
  var short_name: String = js.native
  var types: js.Array[String] = js.native
}

@js.native
trait GeocoderGeometry extends js.Object {
  var bounds: LatLngBounds = js.native
  var location: LatLng = js.native
  var location_type: GeocoderLocationType = js.native
  var viewport: LatLngBounds = js.native
}

@js.native
sealed trait GeocoderLocationType extends js.Object {
}

@JSName("google.maps.GeocoderLocationType")
@js.native
object GeocoderLocationType extends js.Object {
  var APPROXIMATE: GeocoderLocationType = js.native
  var GEOMETRIC_CENTER: GeocoderLocationType = js.native
  var RANGE_INTERPOLATED: GeocoderLocationType = js.native
  var ROOFTOP: GeocoderLocationType = js.native

  @JSBracketAccess
  def apply(value: GeocoderLocationType): String = js.native
}

@JSName("google.maps.DirectionsRenderer")
@js.native
class DirectionsRenderer protected() extends MVCObject {
  def this(opts: DirectionsRendererOptions = ???) = this()

  def getDirections(): DirectionsResult = js.native

  def getMap(): Map = js.native

  def getPanel(): Element = js.native

  def getRouteIndex(): Double = js.native

  def setDirections(directions: DirectionsResult): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: DirectionsRendererOptions): Unit = js.native

  def setPanel(panel: Element): Unit = js.native

  def setRouteIndex(routeIndex: Double): Unit = js.native
}

@js.native
trait DirectionsRendererOptions extends js.Object {
  var directions: DirectionsResult = js.native
  var draggable: Boolean = js.native
  var hideRouteList: Boolean = js.native
  var infoWindow: InfoWindow = js.native
  var map: Map = js.native
  var markerOptions: MarkerOptions = js.native
  var panel: Element = js.native
  var polylineOptions: PolylineOptions = js.native
  var preserveViewport: Boolean = js.native
  var routeIndex: Double = js.native
  var suppressBicyclingLayer: Boolean = js.native
  var suppressInfoWindows: Boolean = js.native
  var suppressMarkers: Boolean = js.native
  var suppressPolylines: Boolean = js.native
}


object DirectionsRendererOptions{
  def apply(
        directions: js.UndefOr[DirectionsResult] = js.undefined,
        draggable: js.UndefOr[Boolean] = js.undefined,
        hideRouteList: js.UndefOr[Boolean] = js.undefined,
        infoWindow: js.UndefOr[InfoWindow] = js.undefined,
        map: Map,
        markerOptions: js.UndefOr[MarkerOptions] = js.undefined,
        panel: js.UndefOr[Element] = js.undefined,
        polylineOptions: js.UndefOr[PolylineOptions] = js.undefined,
        preserveViewport: js.UndefOr[Boolean] = js.undefined,
        routeIndex: js.UndefOr[Double] = js.undefined,
        suppressBicyclingLayer: js.UndefOr[Boolean] = js.undefined,
        suppressInfoWindows: js.UndefOr[Boolean] = js.undefined,
        suppressMarkers: js.UndefOr[Boolean] = js.undefined,
        suppressPolylines: js.UndefOr[Boolean] = js.undefined
             ):DirectionsRendererOptions = {
    val result = js.Dynamic.literal()
    result.map = map
    directions.foreach(result.directions = _)
    draggable.foreach(result.draggable = _)
    hideRouteList.foreach(result.hideRouteList = _)
    infoWindow.foreach(result.infoWindow = _)
    markerOptions.foreach(result.markerOptions = _)
    panel.foreach(result.panel = _)
    polylineOptions.foreach(result.polylineOptions = _)
    preserveViewport.foreach(result.preserveViewport = _)
    routeIndex.foreach(result.routeIndex = _)
    suppressBicyclingLayer.foreach(result.suppressBicyclingLayer = _)
    suppressInfoWindows.foreach(result.suppressInfoWindows = _)
    suppressMarkers.foreach(result.suppressMarkers = _)
    suppressPolylines.foreach(result.suppressPolylines = _)
    result.asInstanceOf[DirectionsRendererOptions]

  }
}

@JSName("google.maps.DirectionsService")
@js.native
class DirectionsService extends js.Object {
  def route(request: DirectionsRequest, callback: js.Function2[DirectionsResult, DirectionsStatus, Unit]): Unit = js.native
}

@js.native
trait DirectionsRequest extends js.Object {
  var avoidHighways: Boolean = js.native
  var avoidTolls: Boolean = js.native
  var destination: js.Any = js.native
  var optimizeWaypoints: Boolean = js.native
  var origin: js.Any = js.native
  var provideRouteAlternatives: Boolean = js.native
  var region: String = js.native
  var transitOptions: TransitOptions = js.native
  var travelMode: TravelMode = js.native
  var unitSystem: UnitSystem = js.native
  var waypoints: js.Array[DirectionsWaypoint] = js.native
}

@js.native
sealed trait TravelMode extends js.Object {
}

@JSName("google.maps.TravelMode")
@js.native
object TravelMode extends js.Object {
  var BICYCLING: TravelMode = js.native
  var DRIVING: TravelMode = js.native
  var TRANSIT: TravelMode = js.native
  var WALKING: TravelMode = js.native

  @JSBracketAccess
  def apply(value: TravelMode): String = js.native
}

@js.native
sealed trait UnitSystem extends js.Object {
}

@JSName("google.maps.UnitSystem")
@js.native
object UnitSystem extends js.Object {
  var IMPERIAL: UnitSystem = js.native
  var METRIC: UnitSystem = js.native

  @JSBracketAccess
  def apply(value: UnitSystem): String = js.native
}

@js.native
trait TransitOptions extends js.Object {
  var arrivalTime: Date = js.native
  var departureTime: Date = js.native
}

@js.native
trait DirectionsWaypoint extends js.Object {
  var location: js.Any = js.native
  var stopover: Boolean = js.native
}

@js.native
sealed trait DirectionsStatus extends js.Object {
}

@JSName("google.maps.DirectionsStatus")
@js.native
object DirectionsStatus extends js.Object {
  var INVALID_REQUEST: DirectionsStatus = js.native
  var MAX_WAYPOINTS_EXCEEDED: DirectionsStatus = js.native
  var NOT_FOUND: DirectionsStatus = js.native
  var OK: DirectionsStatus = js.native
  var OVER_QUERY_LIMIT: DirectionsStatus = js.native
  var REQUEST_DENIED: DirectionsStatus = js.native
  var UNKNOWN_ERROR: DirectionsStatus = js.native
  var ZERO_RESULTS: DirectionsStatus = js.native

  @JSBracketAccess
  def apply(value: DirectionsStatus): String = js.native
}

@js.native
trait DirectionsResult extends js.Object {
  var routes: js.Array[DirectionsRoute] = js.native
}

@js.native
trait DirectionsRoute extends js.Object {
  var bounds: LatLngBounds = js.native
  var copyrights: String = js.native
  var legs: js.Array[DirectionsLeg] = js.native
  var overview_path: js.Array[LatLng] = js.native
  var warnings: js.Array[String] = js.native
  var waypoint_order: js.Array[Double] = js.native
}

@js.native
trait DirectionsLeg extends js.Object {
  var arrival_time: Distance = js.native
  var departure_time: Duration = js.native
  var distance: Distance = js.native
  var duration: Duration = js.native
  var end_address: String = js.native
  var end_location: LatLng = js.native
  var start_address: String = js.native
  var start_location: LatLng = js.native
  var steps: js.Array[DirectionsStep] = js.native
  var via_waypoints: js.Array[LatLng] = js.native
}

@js.native
trait DirectionsStep extends js.Object {
  var distance: Distance = js.native
  var duration: Duration = js.native
  var end_location: LatLng = js.native
  var instructions: String = js.native
  var path: js.Array[LatLng] = js.native
  var start_location: LatLng = js.native
  var steps: DirectionsStep = js.native
  var transit: TransitDetails = js.native
  var travel_mode: TravelMode = js.native
}

@js.native
trait Distance extends js.Object {
  var text: String = js.native
  var value: Double = js.native
}

@js.native
trait Duration extends js.Object {
  var text: String = js.native
  var value: Double = js.native
}

@js.native
trait Time extends js.Object {
  var text: String = js.native
  var time_zone: String = js.native
  var value: Date = js.native
}

@js.native
trait TransitDetails extends js.Object {
  var arrival_stop: TransitStop = js.native
  var arrival_time: Time = js.native
  var departure_stop: TransitStop = js.native
  var departure_time: Time = js.native
  var headsign: String = js.native
  var headway: Double = js.native
  var line: TransitLine = js.native
  var num_stops: Double = js.native
}

@js.native
trait TransitStop extends js.Object {
  var location: LatLng = js.native
  var name: String = js.native
}

@js.native
trait TransitLine extends js.Object {
  var agencies: js.Array[TransitAgency] = js.native
  var color: String = js.native
  var icon: String = js.native
  var name: String = js.native
  var short_name: String = js.native
  var text_color: String = js.native
  var url: String = js.native
  var vehicle: TransitVehicle = js.native
}

@js.native
trait TransitAgency extends js.Object {
  var name: String = js.native
  var phone: String = js.native
  var url: String = js.native
}

@js.native
trait TransitVehicle extends js.Object {
  var icon: String = js.native
  var local_icon: String = js.native
  var name: String = js.native
  var `type`: String = js.native
}

@JSName("google.maps.ElevationService")
@js.native
class ElevationService extends js.Object {
  def getElevationAlongPath(request: PathElevationRequest, callback: js.Function2[js.Array[ElevationResult], ElevationStatus, Unit]): Unit = js.native

  def getElevationForLocations(request: LocationElevationRequest, callback: js.Function2[js.Array[ElevationResult], ElevationStatus, Unit]): Unit = js.native
}

@js.native
trait LocationElevationRequest extends js.Object {
  var locations: js.Array[LatLng] = js.native
}

@js.native
trait PathElevationRequest extends js.Object {
  var path: js.Array[LatLng] = js.native
  var samples: Double = js.native
}

@js.native
trait ElevationResult extends js.Object {
  var elevation: Double = js.native
  var location: LatLng = js.native
  var resolution: Double = js.native
}

@js.native
sealed trait ElevationStatus extends js.Object {
}

@JSName("google.maps.ElevationStatus")
@js.native
object ElevationStatus extends js.Object {
  var INVALID_REQUEST: ElevationStatus = js.native
  var OK: ElevationStatus = js.native
  var OVER_QUERY_LIMIT: ElevationStatus = js.native
  var REQUEST_DENIED: ElevationStatus = js.native
  var UNKNOWN_ERROR: ElevationStatus = js.native

  @JSBracketAccess
  def apply(value: ElevationStatus): String = js.native
}

@JSName("google.maps.MaxZoomService")
@js.native
class MaxZoomService extends js.Object {
  def getMaxZoomAtLatLng(latlng: LatLng, callback: js.Function1[MaxZoomResult, Unit]): Unit = js.native
}

@js.native
trait MaxZoomResult extends js.Object {
  var status: MaxZoomStatus = js.native
  var zoom: Double = js.native
}

@js.native
sealed trait MaxZoomStatus extends js.Object {
}

@JSName("google.maps.MaxZoomStatus")
@js.native
object MaxZoomStatus extends js.Object {
  var ERROR: MaxZoomStatus = js.native
  var OK: MaxZoomStatus = js.native

  @JSBracketAccess
  def apply(value: MaxZoomStatus): String = js.native
}

@JSName("google.maps.DistanceMatrixService")
@js.native
class DistanceMatrixService extends js.Object {
  def getDistanceMatrix(request: DistanceMatrixRequest, callback: js.Function2[DistanceMatrixResponse, DistanceMatrixStatus, Unit]): Unit = js.native
}

@js.native
trait DistanceMatrixRequest extends js.Object {
  var avoidHighways: Boolean = js.native
  var avoidTolls: Boolean = js.native
  var destinations: js.Array[js.Any] = js.native
  var origins: js.Array[js.Any] = js.native
  var region: String = js.native
  var travelMode: TravelMode = js.native
  var unitSystem: UnitSystem = js.native
}

@js.native
trait DistanceMatrixResponse extends js.Object {
  var destinationAddresses: js.Array[String] = js.native
  var originAddresses: js.Array[String] = js.native
  var rows: js.Array[DistanceMatrixResponseRow] = js.native
}

@js.native
trait DistanceMatrixResponseRow extends js.Object {
  var elements: js.Array[DistanceMatrixResponseElement] = js.native
}

@js.native
trait DistanceMatrixResponseElement extends js.Object {
  var distance: Distance = js.native
  var duration: Duration = js.native
  var status: DistanceMatrixElementStatus = js.native
}

@js.native
sealed trait DistanceMatrixStatus extends js.Object {
}

@JSName("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends js.Object {
  var INVALID_REQUEST: DistanceMatrixStatus = js.native
  var MAX_DIMENSIONS_EXCEEDED: DistanceMatrixStatus = js.native
  var MAX_ELEMENTS_EXCEEDED: DistanceMatrixStatus = js.native
  var OK: DistanceMatrixStatus = js.native
  var OVER_QUERY_LIMIT: DistanceMatrixStatus = js.native
  var REQUEST_DENIED: DistanceMatrixStatus = js.native
  var UNKNOWN_ERROR: DistanceMatrixStatus = js.native

  @JSBracketAccess
  def apply(value: DistanceMatrixStatus): String = js.native
}

@js.native
sealed trait DistanceMatrixElementStatus extends js.Object {
}

@JSName("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends js.Object {
  var NOT_FOUND: DistanceMatrixElementStatus = js.native
  var OK: DistanceMatrixElementStatus = js.native
  var ZERO_RESULTS: DistanceMatrixElementStatus = js.native

  @JSBracketAccess
  def apply(value: DistanceMatrixElementStatus): String = js.native
}

@js.native
trait MapType extends js.Object {
  def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document): Element = js.native

  def releaseTile(tile: Element): Unit = js.native

  var alt: String = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var name: String = js.native
  var projection: Projection = js.native
  var radius: Double = js.native
  var tileSize: Size = js.native
}

@JSName("google.maps.MapTypeRegistry")
@js.native
class MapTypeRegistry extends MVCObject {
  def set(id: String, mapType: MapType): Unit = js.native
}

@js.native
trait Projection extends js.Object {
  def fromLatLngToPoint(latLng: LatLng, point: Point = ???): Point = js.native

  def fromPointToLatLng(pixel: Point, noWrap: Boolean = ???): LatLng = js.native
}

@JSName("google.maps.ImageMapType")
@js.native
class ImageMapType protected() extends MVCObject with MapType {
  def this(opts: ImageMapTypeOptions) = this()

  def getOpacity(): Double = js.native

  def setOpacity(opacity: Double): Unit = js.native

  override def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document): Element = js.native

  override def releaseTile(tile: Element): Unit = js.native
}

@js.native
trait ImageMapTypeOptions extends js.Object {
  var alt: String = js.native
  var getTileUrl: js.Function2[Point, Double, String] = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var name: String = js.native
  var opacity: Double = js.native
  var tileSize: Size = js.native
}

@JSName("google.maps.StyledMapType")
@js.native
class StyledMapType protected() extends js.Object {
  def this(styles: js.Array[MapTypeStyle], options: StyledMapTypeOptions = ???) = this()
}

@js.native
trait StyledMapTypeOptions extends js.Object {
  var alt: String = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var name: String = js.native
}

@js.native
trait MapTypeStyle extends js.Object {
  var elementType: MapTypeStyleElementType = js.native
  var featureType: MapTypeStyleFeatureType = js.native
  var stylers: js.Array[MapTypeStyler] = js.native
}

@js.native
trait MapTypeStyleFeatureType extends js.Object {
  var administrative: js.Any = js.native
  var all: String = js.native
  var landscape: js.Any = js.native
  var poi: js.Any = js.native
  var road: js.Any = js.native
  var transit: js.Any = js.native
  var water: String = js.native
}

@js.native
sealed trait MapTypeStyleElementType extends js.Object {
}

@JSName("google.maps.MapTypeStyleElementType")
@js.native
object MapTypeStyleElementType extends js.Object {
  var all: MapTypeStyleElementType = js.native
  var geometry: MapTypeStyleElementType = js.native
  var labels: MapTypeStyleElementType = js.native

  @JSBracketAccess
  def apply(value: MapTypeStyleElementType): String = js.native
}

@js.native
trait MapTypeStyler extends js.Object {
  var gamma: Double = js.native
  var hue: String = js.native
  var invert_lightness: Boolean = js.native
  var lightness: Double = js.native
  var saturation: Double = js.native
  var visibility: String = js.native
}

@JSName("google.maps.BicyclingLayer")
@js.native
class BicyclingLayer extends MVCObject {
  def getMap(): Map = js.native

  def setMap(map: Map): Unit = js.native
}

@JSName("google.maps.FusionTablesLayer")
@js.native
class FusionTablesLayer protected() extends MVCObject {
  def this(options: FusionTablesLayerOptions) = this()

  def getMap(): Map = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: FusionTablesLayerOptions): Unit = js.native
}

@js.native
trait FusionTablesLayerOptions extends js.Object {
  var clickable: Boolean = js.native
  var heatmap: FusionTablesHeatmap = js.native
  var map: Map = js.native
  var query: FusionTablesQuery = js.native
  var styles: js.Array[FusionTablesStyle] = js.native
  var suppressInfoWindows: Boolean = js.native
}

@js.native
trait FusionTablesQuery extends js.Object {
  var from: String = js.native
  var limit: Double = js.native
  var offset: Double = js.native
  var orderBy: String = js.native
  var select: String = js.native
  var where: String = js.native
}

@js.native
trait FusionTablesStyle extends js.Object {
  var markerOptions: FusionTablesMarkerOptions = js.native
  var polygonOptions: FusionTablesPolygonOptions = js.native
  var polylineOptions: FusionTablesPolylineOptions = js.native
  var where: String = js.native
}

@js.native
trait FusionTablesHeatmap extends js.Object {
  var enabled: Boolean = js.native
}

@js.native
trait FusionTablesMarkerOptions extends js.Object {
  var iconName: String = js.native
}

@js.native
trait FusionTablesPolygonOptions extends js.Object {
  var fillColor: String = js.native
  var fillOpacity: Double = js.native
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokeWeight: Double = js.native
}

@js.native
trait FusionTablesPolylineOptions extends js.Object {
  var strokeColor: String = js.native
  var strokeOpacity: Double = js.native
  var strokeWeight: Double = js.native
}

@js.native
trait FusionTablesMouseEvent extends js.Object {
  var infoWindowHtml: String = js.native
  var latLng: LatLng = js.native
  var pixelOffset: Size = js.native
  var row: Object = js.native
}

@js.native
trait FusionTablesCell extends js.Object {
  var columnName: String = js.native
  var value: String = js.native
}

@JSName("google.maps.KmlLayer")
@js.native
class KmlLayer protected() extends MVCObject {
  def this(url: String, opts: KmlLayerOptions = ???) = this()

  def getDefaultViewport(): LatLngBounds = js.native

  def getMap(): Map = js.native

  def getMetadata(): KmlLayerMetadata = js.native

  def getStatus(): KmlLayerStatus = js.native

  def getUrl(): String = js.native

  def setMap(map: Map): Unit = js.native
}

@js.native
trait KmlLayerOptions extends js.Object {
  var clickable: Boolean = js.native
  var map: Map = js.native
  var preserveViewport: Boolean = js.native
  var suppressInfoWindows: Boolean = js.native
}

@js.native
trait KmlLayerMetadata extends js.Object {
  var author: KmlAuthor = js.native
  var description: String = js.native
  var name: String = js.native
  var snippet: String = js.native
}

@js.native
sealed trait KmlLayerStatus extends js.Object {
}

@JSName("google.maps.KmlLayerStatus")
@js.native
object KmlLayerStatus extends js.Object {
  var DOCUMENT_NOT_FOUND: KmlLayerStatus = js.native
  var DOCUMENT_TOO_LARGE: KmlLayerStatus = js.native
  var FETCH_ERROR: KmlLayerStatus = js.native
  var INVALID_DOCUMENT: KmlLayerStatus = js.native
  var INVALID_REQUEST: KmlLayerStatus = js.native
  var LIMITS_EXCEEDED: KmlLayerStatus = js.native
  var OK: KmlLayerStatus = js.native
  var TIMED_OUT: KmlLayerStatus = js.native
  var UNKNOWN: KmlLayerStatus = js.native

  @JSBracketAccess
  def apply(value: KmlLayerStatus): String = js.native
}

@js.native
trait KmlMouseEvent extends js.Object {
  var featureData: KmlFeatureData = js.native
  var latLng: LatLng = js.native
  var pixelOffset: Size = js.native
}

@js.native
trait KmlFeatureData extends js.Object {
  var author: KmlAuthor = js.native
  var description: String = js.native
  var id: String = js.native
  var infoWindowHtml: String = js.native
  var name: String = js.native
  var snippet: String = js.native
}

@js.native
trait KmlAuthor extends js.Object {
  var email: String = js.native
  var name: String = js.native
  var uri: String = js.native
}

@JSName("google.maps.TrafficLayer")
@js.native
class TrafficLayer extends MVCObject {
  def getMap(): Unit = js.native

  def setMap(map: Map): Unit = js.native
}

@JSName("google.maps.TransitLayer")
@js.native
class TransitLayer extends MVCObject {
  def getMap(): Unit = js.native

  def setMap(map: Map): Unit = js.native
}

@JSName("google.maps.StreetViewPanorama")
@js.native
class StreetViewPanorama protected() extends js.Object {
  def this(container: Element, opts: StreetViewPanoramaOptions = ???) = this()

  var controls: js.Array[MVCArray] = js.native

  def getLinks(): js.Array[StreetViewLink] = js.native

  def getPano(): String = js.native

  def getPosition(): LatLng = js.native

  def getPov(): StreetViewPov = js.native

  def getVisible(): Boolean = js.native

  def registerPanoProvider(provider: js.Function1[String, StreetViewPanoramaData]): Unit = js.native

  def setPano(pano: String): Unit = js.native

  def setPosition(latLng: LatLng): Unit = js.native

  def setPov(pov: StreetViewPov): Unit = js.native

  def setVisible(flag: Boolean): Unit = js.native
}

@js.native
trait StreetViewPanoramaOptions extends js.Object {
  var addressControl: Boolean = js.native
  var addressControlOptions: StreetViewAddressControlOptions = js.native
  var clickToGo: Boolean = js.native
  var disableDoubleClickZoom: Boolean = js.native
  var enableCloseButton: Boolean = js.native
  var imageDateControl: Boolean = js.native
  var linksControl: Boolean = js.native
  var panControl: Boolean = js.native
  var panControlOptions: PanControlOptions = js.native
  var pano: String = js.native
  var panoProvider: js.Function1[String, StreetViewPanoramaData] = js.native
  var position: LatLng = js.native
  var pov: StreetViewPov = js.native
  var scrollwheel: Boolean = js.native
  var visible: Boolean = js.native
  var zoomControl: Boolean = js.native
  var zoomControlOptions: ZoomControlOptions = js.native
}

@js.native
trait StreetViewAddressControlOptions extends js.Object {
  var position: ControlPosition = js.native
}

@js.native
trait StreetViewLink extends js.Object {
  var description: String = js.native
  var heading: Double = js.native
  var pano: String = js.native
}

@js.native
trait StreetViewPov extends js.Object {
  var heading: Double = js.native
  var pitch: Double = js.native
  var zoom: Double = js.native
}

@js.native
trait StreetViewPanoramaData extends js.Object {
  var copyright: String = js.native
  var imageDate: String = js.native
  var links: js.Array[StreetViewLink] = js.native
  var location: StreetViewLocation = js.native
  var tiles: StreetViewTileData = js.native
}

@js.native
trait StreetViewLocation extends js.Object {
  var description: String = js.native
  var latLng: LatLng = js.native
  var pano: String = js.native
}

@js.native
trait StreetViewTileData extends js.Object {
  var centerHeading: Double = js.native
  var tileSize: Size = js.native
  var worldSize: Size = js.native
}

@JSName("google.maps.StreetViewService")
@js.native
class StreetViewService extends js.Object {
  def getPanoramaById(pano: String, callback: js.Function2[StreetViewPanoramaData, StreetViewStatus, Unit]): Unit = js.native

  def getPanoramaByLocation(latlng: LatLng, radius: Double, callback: js.Function2[StreetViewPanoramaData, StreetViewStatus, Unit]): Unit = js.native
}

@js.native
sealed trait StreetViewStatus extends js.Object {
}

@JSName("google.maps.StreetViewStatus")
@js.native
object StreetViewStatus extends js.Object {
  var OK: StreetViewStatus = js.native
  var UNKNOWN_ERROR: StreetViewStatus = js.native
  var ZERO_RESULTS: StreetViewStatus = js.native

  @JSBracketAccess
  def apply(value: StreetViewStatus): String = js.native
}

@js.native
trait MapsEventListener extends js.Object {
}

@JSName("google.maps.event")
@js.native
class event extends js.Object {
}

@JSName("google.maps.event")
@js.native
object event extends js.Object {
  def addDomListener(instance: js.Any, eventName: String, handler: js.Function, capture: Boolean = ???): MapsEventListener = js.native

  def addDomListenerOnce(instance: js.Any, eventName: String, handler: js.Function, capture: Boolean = ???): MapsEventListener = js.native

  def addListener(instance: js.Any, eventName: String, handler: js.Function): MapsEventListener = js.native

  def addListenerOnce(instance: js.Any, eventName: String, handler: js.Function): MapsEventListener = js.native

  def clearInstanceListeners(instance: js.Any): Unit = js.native

  def clearListeners(instance: js.Any, eventName: String): Unit = js.native

  def removeListener(listener: MapsEventListener): Unit = js.native

  def trigger(instance: js.Any, eventName: String, args: js.Any*): Unit = js.native
}

@js.native
trait MouseEvent extends js.Object {
  def stop(): Unit = js.native

  var latLng: LatLng = js.native
}

@JSName("google.maps.LatLng")
@js.native
class LatLng protected() extends Geometry {
  def this(lat: Double, lng: Double, noWrap: Boolean = ???) = this()

  def equals(other: LatLng): Boolean = js.native

  def lat(): Double = js.native

  def lng(): Double = js.native

  override  def toString(): String = js.native

  def toUrlValue(precision: Double = ???): String = js.native
}

@JSName("google.maps.LatLngBounds")
@js.native
class LatLngBounds protected() extends js.Object {
  def this(sw: LatLng = ???, ne: LatLng = ???) = this()

  def contains(latLng: LatLng): Boolean = js.native

  def equals(other: LatLngBounds): Boolean = js.native

  def extend(point: LatLng): LatLngBounds = js.native

  def getCenter(): LatLng = js.native

  def getNorthEast(): LatLng = js.native

  def getSouthWest(): LatLng = js.native

  def intersects(other: LatLngBounds): Boolean = js.native

  def isEmpty(): Boolean = js.native

  def toSpan(): LatLng = js.native

  override def toString(): String = js.native

  def toUrlValue(precision: Double = ???): String = js.native

  def union(other: LatLngBounds): LatLngBounds = js.native
}

@JSName("google.maps.Point")
@js.native
class Point protected() extends js.Object {
  def this(x: Double, y: Double) = this()

  var x: Double = js.native
  var y: Double = js.native

  def equals(other: Point): Boolean = js.native

  override def toString(): String = js.native
}

@JSName("google.maps.Size")
@js.native
class Size protected() extends js.Object {
  def this(width: Double, height: Double, widthUnit: js.UndefOr[String] = js.undefined, heightUnit: js.UndefOr[String] = js.undefined) = this()

  var height: Double = js.native
  var width: Double = js.native

  def equals(other: Size): Boolean = js.native

  override def toString(): String = js.native
}

package geometry {

@JSName("google.maps.geometry.encoding")
@js.native
class encoding extends js.Object {
}

@JSName("google.maps.geometry.encoding")
@js.native
object encoding extends js.Object {
  def decodePath(encodedPath: String): js.Array[LatLng] = js.native

  def encodePath(path: js.Array[js.Any]): String = js.native
}

@JSName("google.maps.geometry.spherical")
@js.native
class spherical extends js.Object {
}

@JSName("google.maps.geometry.spherical")
@js.native
object spherical extends js.Object {
  def computeArea(path: js.Array[js.Any], radius: Double = ???): Double = js.native

  def computeDistanceBetween(from: LatLng, to: LatLng, radius: Double = ???): Double = js.native

  def computeHeading(from: LatLng, to: LatLng): Double = js.native

  def computeLength(path: js.Array[js.Any], radius: Double = ???): Double = js.native

  def computeOffset(from: LatLng, distance: Double, heading: Double, radius: Double = ???): LatLng = js.native

  def computeSignedArea(loop: js.Array[js.Any], radius: Double = ???): Double = js.native

  def interpolate(from: LatLng, to: LatLng, fraction: Double): LatLng = js.native
}

@JSName("google.maps.geometry.poly")
@js.native
class poly extends js.Object {
}

@JSName("google.maps.geometry.poly")
@js.native
object poly extends js.Object {
  def containsLocation(point: LatLng, polygon: Polygon): Boolean = js.native

  def isLocationOnEdge(point: LatLng, poly: js.Any, tolerance: Double = ???): Boolean = js.native
}

}

package adsense {

@JSName("google.maps.adsense.AdUnit")
@js.native
class AdUnit protected() extends MVCObject {
  def this(container: Element, opts: AdUnitOptions) = this()

  def getChannelNumber(): String = js.native

  def getContainer(): Element = js.native

  def getFormat(): AdFormat = js.native

  def getMap(): Map = js.native

  def getPosition(): ControlPosition = js.native

  def getPublisherId(): String = js.native

  def setChannelNumber(channelNumber: String): Unit = js.native

  def setFormat(format: AdFormat): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setPosition(position: ControlPosition): Unit = js.native
}

@js.native
trait AdUnitOptions extends js.Object {
  var channelNumber: String = js.native
  var format: AdFormat = js.native
  var map: Map = js.native
  var position: ControlPosition = js.native
  var publisherId: String = js.native
}

@js.native
sealed trait AdFormat extends js.Object {
}

@JSName("google.maps.adsense.AdFormat")
@js.native
object AdFormat extends js.Object {
  var BANNER: AdFormat = js.native
  var BUTTON: AdFormat = js.native
  var HALF_BANNER: AdFormat = js.native
  var LARGE_RECTANGLE: AdFormat = js.native
  var LEADERBOARD: AdFormat = js.native
  var MEDIUM_RECTANGLE: AdFormat = js.native
  var SKYSCRAPER: AdFormat = js.native
  var SMALL_RECTANGLE: AdFormat = js.native
  var SMALL_SQUARE: AdFormat = js.native
  var SQUARE: AdFormat = js.native
  var VERTICAL_BANNER: AdFormat = js.native
  var WIDE_SKYSCRAPER: AdFormat = js.native

  @JSBracketAccess
  def apply(value: AdFormat): String = js.native
}

}

package panoramio {

@JSName("google.maps.panoramio.PanoramioLayer")
@js.native
class PanoramioLayer protected() extends MVCObject {
  def this(opts: PanoramioLayerOptions = ???) = this()

  def getMap(): Map = js.native

  def getTag(): String = js.native

  def getUserId(): String = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: PanoramioLayerOptions): Unit = js.native

  def setTag(tag: String): Unit = js.native

  def setUserId(userId: String): Unit = js.native
}

@js.native
trait PanoramioLayerOptions extends js.Object {
  var map: Map = js.native
  var suppressInfoWindows: Boolean = js.native
  var tag: String = js.native
  var userId: String = js.native
}

@js.native
trait PanoramioFeature extends js.Object {
  var author: String = js.native
  var photoId: String = js.native
  var title: String = js.native
  var url: String = js.native
  var userId: String = js.native
}

@js.native
trait PanoramioMouseEvent extends js.Object {
  var featureDetails: PanoramioFeature = js.native
  var infoWindowHtml: String = js.native
  var latLng: LatLng = js.native
  var pixelOffset: Size = js.native
}

}

package places {

@JSName("google.maps.places.AutocompleteService")
@js.native
class AutocompleteService extends MVCObject {
  def getPlacePredictions(request: AutocompletionRequest, callback: js.Function2[js.Array[AutocompletePrediction], PlacesServiceStatus, Unit]): Unit = js.native

  def getQueryPredictions(request: QueryAutocompletionRequest, callback: js.Function2[js.Array[QueryAutocompletePrediction], PlacesServiceStatus, Unit]): Unit = js.native
}

@js.native
trait AutocompletionRequest extends js.Object {
  var input: String = js.native
  var bounds: LatLngBounds = js.native
  var componentRestrictions: ComponentRestrictions = js.native
  var location: LatLng = js.native
  var offset: Double = js.native
  var radius: Double = js.native
  var types: js.Array[String] = js.native
}

@js.native
trait QueryAutocompletionRequest extends js.Object {
  var input: String = js.native
  var bounds: LatLngBounds = js.native
  var location: LatLng = js.native
  var offset: Double = js.native
  var radius: Double = js.native
}

@js.native
trait AutocompletePrediction extends js.Object {
  var description: String = js.native
  var matched_substrings: js.Array[PredictionSubstring] = js.native
  var place_id: String = js.native
  var terms: js.Array[PredictionTerm] = js.native
  var types: js.Array[String] = js.native
}

@js.native
trait PredictionTerm extends js.Object {
  var offset: Double = js.native
  var value: String = js.native
}

@js.native
trait PredictionSubstring extends js.Object {
  var length: Double = js.native
  var offset: Double = js.native
}

@js.native
trait QueryAutocompletePrediction extends js.Object {
  var description: String = js.native
  var matched_substrings: js.Array[PredictionSubstring] = js.native
  var place_id: String = js.native
  var terms: js.Array[PredictionTerm] = js.native
}

@JSName("google.maps.places.Autocomplete")
@js.native
class Autocomplete protected() extends MVCObject {
  def this(inputField: html.Input, opts: AutocompleteOptions = ???) = this()

  def getBounds(): LatLngBounds = js.native

  def getPlace(): PlaceResult = js.native

  def setBounds(bounds: LatLngBounds): Unit = js.native

  def setComponentRestrictions(restrictions: ComponentRestrictions): Unit = js.native

  def setTypes(types: js.Array[String]): Unit = js.native
}

@js.native
trait AutocompleteOptions extends js.Object {
  var bounds: LatLngBounds = js.native
  var componentRestrictions: ComponentRestrictions = js.native
  var types: js.Array[String] = js.native
}

@js.native
trait ComponentRestrictions extends js.Object {
  var country: String = js.native
}

@js.native
trait PhotoOptions extends js.Object {
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
}

@js.native
trait PlaceAspectRating extends js.Object {
  var rating: Double = js.native
  var `type`: String = js.native
}

@js.native
trait PlaceDetailsRequest extends js.Object {
  var placeId: String = js.native
  var reference: String = js.native
}

@js.native
trait PlaceGeometry extends js.Object {
  var location: LatLng = js.native
  var viewport: LatLngBounds = js.native
}

@js.native
trait PlacePhoto extends js.Object {
  var height: Double = js.native
  var html_attributions: js.Array[String] = js.native
  var width: Double = js.native

  def getUrl(opts: PhotoOptions): String = js.native
}

@js.native
trait PlaceResult extends js.Object {
  var address_components: js.Array[GeocoderAddressComponent] = js.native
  var aspects: js.Array[PlaceAspectRating] = js.native
  var formatted_address: String = js.native
  var formatted_phone_number: String = js.native
  var geometry: PlaceGeometry = js.native
  var html_attributions: js.Array[String] = js.native
  var icon: String = js.native
  var id: String = js.native
  var international_phone_number: String = js.native
  var name: String = js.native
  var permanently_closed: Boolean = js.native
  var photos: js.Array[PlacePhoto] = js.native
  var place_id: String = js.native
  var price_level: Double = js.native
  var rating: Double = js.native
  var reference: String = js.native
  var reviews: js.Array[PlaceReview] = js.native
  var types: js.Array[String] = js.native
  var url: String = js.native
  var vicinity: String = js.native
  var website: String = js.native
}

@js.native
trait PlaceReview extends js.Object {
  var aspects: js.Array[PlaceAspectRating] = js.native
  var author_name: String = js.native
  var author_url: String = js.native
  var language: String = js.native
  var text: String = js.native
}

@js.native
trait PlaceSearchRequest extends js.Object {
  var bounds: LatLngBounds = js.native
  var keyword: String = js.native
  var location: LatLng = js.native
  var maxPriceLevel: Double = js.native
  var minPriceLevel: Double = js.native
  var name: String = js.native
  var openNow: Boolean = js.native
  var radius: Double = js.native
  var rankBy: RankBy = js.native
  var types: js.Array[String] = js.native
}

@js.native
trait PlaceSearchPagination extends js.Object {
  def nextPage(): Unit = js.native

  var hasNextPage: Boolean = js.native
}

@JSName("google.maps.places.PlacesService")
@js.native
class PlacesService protected() extends js.Object {
  def this(attrContainer: html.Div) = this()

  def getDetails(request: PlaceDetailsRequest, callback: js.Function2[PlaceResult, PlacesServiceStatus, Unit]): Unit = js.native

  def nearbySearch(request: PlaceSearchRequest, callback: js.Function3[js.Array[PlaceResult], PlacesServiceStatus, PlaceSearchPagination, Unit]): Unit = js.native

  def radarSearch(request: RadarSearchRequest, callback: js.Function2[js.Array[PlaceResult], PlacesServiceStatus, Unit]): Unit = js.native

  def textSearch(request: TextSearchRequest, callback: js.Function2[js.Array[PlaceResult], PlacesServiceStatus, Unit]): Unit = js.native
}
@js.native
sealed trait PlacesServiceStatus extends js.Object {
}

@JSName("google.maps.places.PlacesServiceStatus")
@js.native
object PlacesServiceStatus extends js.Object {
  var INVALID_REQUEST: PlacesServiceStatus = js.native
  var OK: PlacesServiceStatus = js.native
  var OVER_QUERY_LIMIT: PlacesServiceStatus = js.native
  var REQUEST_DENIED: PlacesServiceStatus = js.native
  var UNKNOWN_ERROR: PlacesServiceStatus = js.native
  var ZERO_RESULTS: PlacesServiceStatus = js.native

  @JSBracketAccess
  def apply(value: PlacesServiceStatus): String = js.native
}

@js.native
trait RadarSearchRequest extends js.Object {
  var bounds: LatLngBounds = js.native
  var keyword: String = js.native
  var location: LatLng = js.native
  var name: String = js.native
  var radius: Double = js.native
  var types: js.Array[String] = js.native
}
@js.native
sealed trait RankBy extends js.Object {
}

@JSName("google.maps.places.RankBy")
@js.native
object RankBy extends js.Object {
  var DISTANCE: RankBy = js.native
  var PROMINENCE: RankBy = js.native

  @JSBracketAccess
  def apply(value: RankBy): String = js.native
}

@JSName("google.maps.places.SearchBox")
@js.native
class SearchBox protected() extends MVCObject {
  def this(inputField: html.Input, opts: SearchBoxOptions = ???) = this()

  def getBounds(): LatLngBounds = js.native

  def setBounds(bounds: LatLngBounds): Unit = js.native

  def getPlaces(): js.Array[PlaceResult] = js.native
}

@js.native
trait SearchBoxOptions extends js.Object {
  var bounds: LatLngBounds = js.native
}

@js.native
trait TextSearchRequest extends js.Object {
  var bounds: LatLngBounds = js.native
  var location: LatLng = js.native
  var query: String = js.native
  var radius: Double = js.native
  var types: js.Array[String] = js.native
}

}

package drawing {

@JSName("google.maps.drawing.DrawingManager")
@js.native
class DrawingManager protected() extends MVCObject {
  def this(options: DrawingManagerOptions = ???) = this()

  def getDrawingMode(): OverlayType = js.native

  def getMap(): Map = js.native

  def setDrawingMode(drawingMode: OverlayType): Unit = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: DrawingManagerOptions): Unit = js.native
}

@js.native
trait DrawingManagerOptions extends js.Object {
  var circleOptions: CircleOptions = js.native
  var drawingControl: Boolean = js.native
  var drawingControlOptions: DrawingControlOptions = js.native
  var drawingMode: OverlayType = js.native
  var map: Map = js.native
  var markerOptions: MarkerOptions = js.native
  var polygonOptions: PolygonOptions = js.native
  var polylineOptions: PolylineOptions = js.native
  var rectangleOptions: RectangleOptions = js.native
}

@js.native
trait DrawingControlOptions extends js.Object {
  var drawingModes: js.Array[OverlayType] = js.native
  var position: ControlPosition = js.native
}

@js.native
trait OverlayCompleteEvent extends js.Object {
  var overlay: MVCObject = js.native
  var `type`: OverlayType = js.native
}
@js.native
sealed trait OverlayType extends js.Object {
}

@JSName("google.maps.drawing.OverlayType")
@js.native
object OverlayType extends js.Object {
  var CIRCLE: OverlayType = js.native
  var MARKER: OverlayType = js.native
  var POLYGON: OverlayType = js.native
  var POLYLINE: OverlayType = js.native
  var RECTANGLE: OverlayType = js.native

  @JSBracketAccess
  def apply(value: OverlayType): String = js.native
}

}

package weather {

@JSName("google.maps.weather.CloudLayer")
@js.native
class CloudLayer extends MVCObject {
  def getMap(): Map = js.native

  def setMap(map: Map): Unit = js.native
}

@JSName("google.maps.weather.WeatherLayer")
@js.native
class WeatherLayer protected() extends MVCObject {
  def this(opts: WeatherLayerOptions = ???) = this()

  def getMap(): Map = js.native

  def setMap(map: Map): Unit = js.native

  def setOptions(options: WeatherLayerOptions): Unit = js.native
}

@js.native
trait WeatherLayerOptions extends js.Object {
  var clickable: Boolean = js.native
  var labelColor: LabelColor = js.native
  var map: Map = js.native
  var suppressInfoWindows: Boolean = js.native
  var temperatureUnits: TemperatureUnit = js.native
  var windSpeedUnits: WindSpeedUnit = js.native
}
@js.native
sealed trait TemperatureUnit extends js.Object {
}

@JSName("google.maps.weather.TemperatureUnit")
@js.native
object TemperatureUnit extends js.Object {
  var CELSIUS: TemperatureUnit = js.native
  var FAHRENHEIT: TemperatureUnit = js.native

  @JSBracketAccess
  def apply(value: TemperatureUnit): String = js.native
}
@js.native
sealed trait WindSpeedUnit extends js.Object {
}

@JSName("google.maps.weather.WindSpeedUnit")
@js.native
object WindSpeedUnit extends js.Object {
  var KILOMETERS_PER_HOUR: WindSpeedUnit = js.native
  var METERS_PER_SECOND: WindSpeedUnit = js.native
  var MILES_PER_HOUR: WindSpeedUnit = js.native

  @JSBracketAccess
  def apply(value: WindSpeedUnit): String = js.native
}
@js.native
sealed trait LabelColor extends js.Object {
}

@JSName("google.maps.weather.LabelColor")
@js.native
object LabelColor extends js.Object {
  var BLACK: LabelColor = js.native
  var WHITE: LabelColor = js.native

  @JSBracketAccess
  def apply(value: LabelColor): String = js.native
}

@js.native
trait WeatherMouseEvent extends js.Object {
  var featureDetails: WeatherFeature = js.native
  var infoWindowHtml: String = js.native
  var latLng: LatLng = js.native
  var pixelOffset: Size = js.native
}

@js.native
trait WeatherFeature extends js.Object {
  var current: WeatherConditions = js.native
  var forecast: js.Array[WeatherForecast] = js.native
  var location: String = js.native
  var temperatureUnit: TemperatureUnit = js.native
  var windSpeedUnit: WindSpeedUnit = js.native
}

@js.native
trait WeatherConditions extends js.Object {
  var day: String = js.native
  var description: String = js.native
  var high: Double = js.native
  var humidity: Double = js.native
  var low: Double = js.native
  var shortDay: String = js.native
  var temperature: Double = js.native
  var windDirection: String = js.native
  var windSpeed: Double = js.native
}

@js.native
trait WeatherForecast extends js.Object {
  var day: String = js.native
  var description: String = js.native
  var high: Double = js.native
  var low: Double = js.native
  var shortDay: String = js.native
}

}

package visualization {

@JSName("google.maps.visualization.HeatmapLayer")
@js.native
class HeatmapLayer protected() extends MVCObject {
  def this(opts: HeatmapLayerOptions = ???) = this()

  def getData(): MVCArray = js.native

  def getMap(): Map = js.native

  def setData(data: MVCArray): Unit = js.native

  def setMap(map: Map): Unit = js.native
}

@js.native
trait HeatmapLayerOptions extends js.Object {
  var data: js.Any = js.native
  var dissipating: Boolean = js.native
  var gradient: js.Array[String] = js.native
  var map: Map = js.native
  var maxIntensity: Double = js.native
  var opacity: Double = js.native
  var radius: Double = js.native
}

@js.native
trait WeightedLocation extends js.Object {
  var location: LatLng = js.native
  var weight: Double = js.native
}

@JSName("google.maps.visualization.MouseEvent")
@js.native
class MouseEvent extends js.Object {
  def stop(): Unit = js.native
}

@JSName("google.maps.visualization.MapsEventListener")
@js.native
class MapsEventListener extends js.Object {
}

}

}

}


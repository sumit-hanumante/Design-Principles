package factory_pattern;

class ShapeFactory {

    //use getShape method to get object of type shape

   Shape getShape(String shapeType){
      switch (shapeType) {
         case "CIRCLE":
            return new Circle();

         case "RECTANGLE":
            return new Rectangle();

         case "SQUARE":
            return new Square();
      }
      return null;
   }
}
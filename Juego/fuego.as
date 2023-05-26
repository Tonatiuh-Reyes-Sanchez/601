package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	
	public class fuego extends MovieClip {
		
		private var vel: Number=5;
		private var a: int=5;

		public function fuego(posX, posY) {
			// constructor code
			
			x = posX + 40;
			y = posY + 250;
			scaleX = .8;
			scaleY = .8;
			
			this.addEventListener(Event.ENTER_FRAME, mover);
			this.addEventListener(Event.ENTER_FRAME, actualiza);
			
		}
		
		
		
		public function mover(e: Event){
			
			y+= vel;
		
			
			if(y>=330){
				
				vel=0;
				this.removeEventListener(Event.ENTER_FRAME, mover);
				stage.removeChild(this);
				
				}
				
				if(this.hitTestObject(Setup.DoctorStrange_new.punto_colision)){
					//trace("Colision");
					vel=0;
				this.removeEventListener(Event.ENTER_FRAME, mover);
				stage.removeChild(this);
				
				Setup.puntos+=1;
				
		
				
				}
				
					/*if (Setup.puntos ==0){
					 vel+=0;
				 }
				 a=Setup.puntos %5
				   if (Setup.puntos >=5  ){
					 vel+=10;
				 }*/
					
					}
					
					public function actualiza(e:Event){
						
			if(Setup.puntos>=a){
				vel+=a;
				a+=5;
			}
			/*if (Setup.puntos ==0){
					 vel+=0;
				 }
				 a=Setup.puntos %5;
				   if (Setup.puntos >=5  ){
					 vel+=a;
					 a+=5;
				 }*/
			
			
			}
			
			}
}
			
package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class Setup extends MovieClip {
		
		
		private var fondo_new: fondo = new  fondo;
		private var piso_new: piso = new  piso;
		private var ScarletWitch_new: ScarletWitch = new  ScarletWitch;
		static var DoctorStrange_new: DoctorStrange = new  DoctorStrange;
		static var puntos_box_new: puntos_box = new puntos_box();
		static var puntos: Number = 0;
		
		

		public function Setup() {
			
			
			// constructor code
			
			addChild(fondo_new);
			addChild(piso_new);
			addChild(ScarletWitch_new);
			addChild(DoctorStrange_new);
			addChild(puntos_box_new);
			
			fondo_new.x=0, fondo_new.y=0;
			piso_new.x=0, piso_new.y=357;
		    ScarletWitch_new.x=250, ScarletWitch_new.y=-180;
			DoctorStrange_new.x=220, DoctorStrange_new.y=120;
			puntos_box_new.x=30, puntos_box_new.y=10;
			puntos_box_new.puntos_txt.text = String(puntos); 
			
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
			
			}
			
			public function actualiza_puntos(e: Event){
				
				puntos_box_new.puntos_txt.text = String(puntos);
				
				
				}

	}
	
	
}
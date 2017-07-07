// Generated by Haxe 3.4.2
package hxDaedalus.iterators;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FromFaceToNeighbourFaces extends haxe.lang.HxObject
{
	public FromFaceToNeighbourFaces(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FromFaceToNeighbourFaces()
	{
		//line 12 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		hxDaedalus.iterators.FromFaceToNeighbourFaces.__hx_ctor_hxDaedalus_iterators_FromFaceToNeighbourFaces(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_iterators_FromFaceToNeighbourFaces(hxDaedalus.iterators.FromFaceToNeighbourFaces __hx_this)
	{
	}
	
	
	
	
	public hxDaedalus.data.Face _fromFace;
	
	public hxDaedalus.data.Edge _nextEdge;
	
	public hxDaedalus.data.Face _resultFace;
	
	public hxDaedalus.data.Face set_fromFace(hxDaedalus.data.Face value)
	{
		//line 15 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		this._fromFace = value;
		//line 16 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		this._nextEdge = this._fromFace.get_edge();
		//line 17 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		return value;
	}
	
	
	public hxDaedalus.data.Face next()
	{
		//line 22 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		if (( this._nextEdge != null )) 
		{
			//line 23 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			while (true)
			{
				//line 24 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				this._resultFace = this._nextEdge.get_rightFace();
				//line 25 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				this._nextEdge = this._nextEdge.get_nextLeftEdge();
				//line 26 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				if (( this._nextEdge == this._fromFace.get_edge() )) 
				{
					//line 27 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					this._nextEdge = null;
					//line 28 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if ( ! (this._resultFace.get_isReal()) ) 
					{
						//line 28 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						this._resultFace = null;
					}
					
					//line 29 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				//line 23 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				if ( ! (( ! (this._resultFace.get_isReal()) )) ) 
				{
					//line 23 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
			}
			
		}
		else
		{
			//line 33 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			this._resultFace = null;
		}
		
		//line 35 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		return this._resultFace;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		{
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			switch (field.hashCode())
			{
				case 516035001:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("_resultFace")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						this._resultFace = ((hxDaedalus.data.Face) (value) );
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return value;
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case -1245086425:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("fromFace")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						this.set_fromFace(((hxDaedalus.data.Face) (value) ));
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return value;
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case 1514466479:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("_nextEdge")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						this._nextEdge = ((hxDaedalus.data.Edge) (value) );
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return value;
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case -1154568570:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("_fromFace")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						this._fromFace = ((hxDaedalus.data.Face) (value) );
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return value;
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		{
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("next")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case -1154568570:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("_fromFace")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return this._fromFace;
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case -1619148700:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("set_fromFace")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_fromFace")) );
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case 1514466479:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("_nextEdge")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return this._nextEdge;
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case 516035001:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("_resultFace")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return this._resultFace;
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		{
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("next")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return this.next();
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
				case -1619148700:
				{
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					if (field.equals("set_fromFace")) 
					{
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						__temp_executeDef1 = false;
						//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
						return this.set_fromFace(((hxDaedalus.data.Face) (dynargs.__get(0)) ));
					}
					
					//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		baseArr.push("_resultFace");
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		baseArr.push("_nextEdge");
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		baseArr.push("_fromFace");
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		baseArr.push("fromFace");
		//line 6 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromFaceToNeighbourFaces.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


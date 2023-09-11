class Producto
	attr_reader :nombre
	attr_reader :precio
	def initialize(nombre,precio)
		@nombre = nombre
		@precio = precio
	end
end


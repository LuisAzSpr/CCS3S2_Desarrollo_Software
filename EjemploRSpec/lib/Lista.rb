class Lista
	attr_reader :cantidad
	attr_reader :productos
	def initialize
		@cantidad = 0
		@productos = []
	end
	def agregar producto 
		@productos << producto
		@cantidad += 1
	end
	def mostrar
		puts "Lista"
		@productos.each do |p|
			puts "#{p.nombre} : $#{p.precio}"
		end
	end
end

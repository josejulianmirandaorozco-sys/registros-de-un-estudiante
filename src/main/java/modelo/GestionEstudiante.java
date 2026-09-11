package modelo;

import java.util.ArrayList;

public class GestionEstudiante {
    private ArrayList<Estudiante> listaEstudiantes;

    public GestionEstudiante() {
        listaEstudiantes = new ArrayList<>();
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public boolean guardar(Estudiante e) {
        if (buscar(e.getCarnet()) == null) {
            listaEstudiantes.add(e);
            return true;
        }
        return false;
    }

    public Estudiante buscar(String carnet) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getCarnet().equalsIgnoreCase(carnet)) {
                return e;
            }
        }
        return null;
    }

    public boolean modificar(Estudiante e) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCarnet().equalsIgnoreCase(e.getCarnet())) {
                listaEstudiantes.set(i, e);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String carnet) {
        Estudiante e = buscar(carnet);
        if (e != null) {
            listaEstudiantes.remove(e);
            return true;
        }
        return false;
    }
}
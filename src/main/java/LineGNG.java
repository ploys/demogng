// ========================================================================== ;
//                                                                            ;
// Copyright 1996-1998 Hartmut S. Loos, Instit. f. Neuroinformatik, Bochum    ;
// Copyright 2012-2013 Bernd Fritzke                                          ;
//                                                                            ;
// This program is free software; you can redistribute it and/or modify       ;
// it under the terms of the GNU General Public License as published by       ;
// the Free Software Foundation; either version 1, or (at your option)        ;
// any later version.                                                         ;
//                                                                            ;
// This program is distributed in the hope that it will be useful,            ;
// but WITHOUT ANY WARRANTY; without even the implied warranty of             ;
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the              ;
// GNU General Public License for more details.                               ;
//                                                                            ;
// You should have received a copy of the GNU General Public License          ;
// along with this program; if not, write to the Free Software                ;
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.                  ;
//                                                                            ;
// ========================================================================== ;

/**
 * A class representing a Voronoi line.
 */
class LineGNG {
    /**
     * The first point (x) of the line
     */
    protected int x1 = -1;
    /**
     * The first point (y) of the line
     */
    protected int y1 = -1;
    /**
     * The last point (x) of the line
     */
    protected int x2 = -1;
    /**
     * The last point (y) of the line
     */
    protected int y2 = -1;

    /**
     * Constructor, allows setting the coordinates.
     *
     * @param x1 The first x coordinate
     * @param y1 The first y coordinate
     * @param x2 The second x coordinate
     * @param y2 The second y coordinate
     */
    public LineGNG(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
